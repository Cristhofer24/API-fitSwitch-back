package com.example.fitswitch.Controller;
import com.example.fitswitch.Model.ISO8583;

import com.example.fitswitch.Repository.repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/iso-8583")
public class ControllerIso8583 {

    private repository isoRepostory;

    public ControllerIso8583(repository isoRepostory) {
        this.isoRepostory = isoRepostory;
    }

    @GetMapping
    public List<ISO8583> getAll() {
        return isoRepostory.findAll();
    }
}
