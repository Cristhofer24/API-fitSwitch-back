package com.example.fitswitch.Service;

import com.example.fitswitch.Model.ISO8583;
import com.example.fitswitch.Model.ISO8583XML;
import com.example.fitswitch.Repository.ISO8583Repository;
import com.example.fitswitch.Repository.ISO8583RepositoryXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class Iso8583Service {

    @Autowired
    private ISO8583Repository iso8583Repository;

    @Autowired
    private ISO8583RepositoryXML iso8583RepositoryXML;

    // Método que obtiene todos los datos de la base de datos
    public List<ISO8583> getAllData() {
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

    public List<Map<String, String>> obtenerXML() {
        List<ISO8583XML> registros = iso8583RepositoryXML.findAll();  // Trae todos los registros

        // Extraer solo los campos XML
        return registros.stream()
                .map(registro -> {
                    Map<String, String> xmlData = new HashMap<>();
                    xmlData.put("wiso114ExtendedData", registro.getWiso114ExtendedData());
                    xmlData.put("wiso115ExtendedData", registro.getWiso115ExtendedData());
                    return xmlData;
                })
                .collect(Collectors.toList());
    }

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

