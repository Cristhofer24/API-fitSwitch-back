package com.example.fitswitch.Controller;


import com.example.fitswitch.Model.ISO8583;
import com.example.fitswitch.Repository.ISO8583Repository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/iso-8583")
public class ISO8583Controller {



    private final ISO8583Repository iso8583Repository;

    public ISO8583Controller(ISO8583Repository iso8583Repository) {
        this.iso8583Repository = iso8583Repository;
    }


    ////Obtener todos los campos y además de eso envía un mensaje a la
    //// tabla cuando los campos esten vacios o sean nulos.
    @GetMapping
    public List<ISO8583> listarISO8583() {
        List<ISO8583> registros = iso8583Repository.findAll();

        for (ISO8583 registro : registros) {
            // Verificar el valor de y modifica por un mensaje
            if (registro.getWiso039ResponseCode() != null && !"000".equals(registro.getWiso039ResponseCode())) {
                registro.setWiso039pRespondeDetail("TRANSACCIÓN FALLIDA");
            }

            // Reemplazar los campos nulos por el mensaje "Sin registro"
            for (Field field : ISO8583.class.getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    if (field.get(registro) == null) {
                        field.set(registro, "Sin registro");
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return registros;
    }

    ////Permite filtrar información a traves de inputs de la tabla
    @GetMapping("/filtrar")
    public List<ISO8583> filtrarPorFechas(
            @RequestParam("WISO_012_LOCALDATETIME")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime wiso012LocalDateTime,

            @RequestParam("WISO_013_LOCALDATE")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime wiso013LocalDate
    ) {
        return iso8583Repository.findByFechaRange(wiso012LocalDateTime, wiso013LocalDate);
    }



    ////Permite poner el semaforo de acuerdo a la condición
    @GetMapping("/semaforo")
    public List<Map<String, Object>> getSemaforoData() {
        List<ISO8583> registros = iso8583Repository.findAll();

        return registros.stream().map(registro -> {
            Map<String, Object> map = new HashMap<>();
            map.put("responseCode", registro.getWiso039ResponseCode());
            map.put("color", "000".equals(registro.getWiso039ResponseCode()) ? "verde" : "rojo");
            return map;
        }).collect(Collectors.toList());
    }

}

