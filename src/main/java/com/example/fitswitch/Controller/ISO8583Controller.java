package com.example.fitswitch.Controller;


import com.example.fitswitch.Model.ISO8583;
import com.example.fitswitch.Model.ISO8583XML;
import com.example.fitswitch.Repository.ISO8583Repository;
import com.example.fitswitch.Repository.ISO8583RepositoryXML;
import com.example.fitswitch.Service.Iso8583Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/iso-8583")
public class ISO8583Controller {
@Autowired
    private  Iso8583Service iso8583Service;
private ISO8583Repository iso8583Repository;




    // Obtener todos los registros
    @GetMapping
    public List<ISO8583> listarISO8583() {
        return iso8583Service.getAllData();
    }

    //Traer los xml de manera independiente

    @GetMapping("/xml")
    public List<Map<String, String>> obtenerXML() {
       return iso8583Service.obtenerXML();
    }


    @GetMapping("/filtrar")
    public List<ISO8583> filtrarPorFechas(
            @RequestParam("WISO_012_LOCALDATETIME")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime wiso012LocalDateTime,

            @RequestParam("WISO_015_SETTLEMENTDATEL")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime wiso015SettlementDatel
    ) {
        return iso8583Repository.findByFechaRange(wiso012LocalDateTime, wiso015SettlementDatel);
    }
    @GetMapping("/semaforo")
    public List<Map<String, Object>> obtenerSemaforo() {
        return iso8583Service.getSemaforoData();
    }

}
