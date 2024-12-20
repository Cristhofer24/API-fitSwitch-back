package com.example.fitswitch.Model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "ISO8583")
public class ISO8583 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WISO_000_MESSAGE_TYPE")
    private String wiso000MessageType;

    @Column(name = "WISO_003_PROCESSINGCODE")
    private String wiso003ProcessingCode;

    @Column(name = "WISO_018_MERCHANTTYPE")
    private String wiso018MerchantType;

    @Column(name = "WISO_024_NETWORKID")
    private String wiso024NetworkId;

    @Column(name = "WISO_007_TRANSDATETIME")
    private String wiso007TransDatetime;

    @Column(name = "WISO_002_PAN")
    private String wiso002Pan;



}
