package com.example.fitswitch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ConfigFitSwitch {
    @Bean(name = "fitSwitchDataSource")
    public DataSource fitSwitchDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@172.17.1.6:1521:fitdvp");
        dataSource.setUsername("FITSWITCH");
        dataSource.setPassword("FITSWITCH");
        return dataSource;
    }

    @Bean(name = "fitSwitchJdbcTemplate")
    public JdbcTemplate fitSwitchJdbcTemplate(DataSource fitSwitchDataSource) {
        return new JdbcTemplate(fitSwitchDataSource);
    }
}
