package com.example.fitswitch.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ISO8583")
public class ISO8583XML {
    //Clave PRIMARIA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WISO_000_MESSAGE_TYPE")
    private String wiso000MessageType;

    //Datos de los XML
    //Botones para el XML
    @Lob
    @Column(name = "WISO_114_EXTENDEDDATA")
    private String wiso114ExtendedData;

    @Lob
    @Column(name = "WISO_115_EXTENDEDDATA")
    private String wiso115ExtendedData;

    public String getWiso114ExtendedData() {
        return wiso114ExtendedData;
    }

    public void setWiso114ExtendedData(String wiso114ExtendedData) {
        this.wiso114ExtendedData = wiso114ExtendedData;
    }

    public String getWiso115ExtendedData() {
        return wiso115ExtendedData;
    }

    public void setWiso115ExtendedData(String wiso115ExtendedData) {
        this.wiso115ExtendedData = wiso115ExtendedData;
    }

    public String getWiso000MessageType() {
        return wiso000MessageType;
    }

    public void setWiso000MessageType(String wiso000MessageType) {
        this.wiso000MessageType = wiso000MessageType;
    }
}
