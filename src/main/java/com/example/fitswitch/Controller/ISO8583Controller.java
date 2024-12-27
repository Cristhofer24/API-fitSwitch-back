package com.example.fitswitch.Controller;


import com.example.fitswitch.Model.ISO8583;
import com.example.fitswitch.Repository.ISO8583Repository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/iso-8583")
public class ISO8583Controller {

    private final ISO8583Repository iso8583Repository;

    public ISO8583Controller(ISO8583Repository iso8583Repository) {
        this.iso8583Repository = iso8583Repository;
    }

    // Obtener todos los registros
    @GetMapping
    public List<ISO8583> listarISO8583() {
        return iso8583Repository.findAll();
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


}
