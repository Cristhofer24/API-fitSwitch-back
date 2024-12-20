package com.example.fitswitch.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class testFistSwitch implements CommandLineRunner {

    private final JdbcTemplate jdbcTemplate;

    // Inyección de dependencia del JdbcTemplate
    public testFistSwitch (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        // Consulta simple para verificar conexión
        String query = "SELECT 1 FROM DUAL";
        Integer result = jdbcTemplate.queryForObject(query, Integer.class);
        System.out.println("Conexión exitosa: Resultado de la consulta -> " + result);
    }


}
