package com.example.fitswitch.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "ISO8583")
public class ISO8583 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "WISO_000_MESSAGE_TYPE")
    private String wiso000MessageType;

    @Column(name = "WISO_002_PAN")
    private String wiso002Pan;

    @Column(name = "WISO_003_PROCESSINGCODE")
    private String wiso003ProcessingCode;

    @Column(name = "WISO_004_AMOUNTTRANSACTION")
    private String wiso004AmountTransaction;

    @Column(name = "WISO_007_TRANSDATETIME")
    private LocalDateTime wiso007TransDatetime;

    @Column(name = "WISO_008_BILLFEEAMOUNT")
    private String wiso008BollFeeAmount;

    @Column(name = "WISO_015_SETTLEMENTDATEL")
    private LocalDateTime wiso015SettlementDatel;

    @Column(name = "WISO_038_AUTORIZATIONNUMBER")
    private String wiso038AutorizationNumber;

    @Column(name = "WISO_039_RESPONSECODE")
    private String wiso039ResponseCode;

    @Column(name = "WISO_039P_RESPONSEDETAIL")
    private String wiso039pRespondeDetail;

    @Column(name = "WISO_044_ADDRESPDATA")
    private String wiso044AddrespData;

    @Column(name = "WISO_102_ACCOUNTID_1")
    private String wiso102AccountId1;

    @Column(name = "WISO_103_ACCOUNTID_2")
    private String wiso103AccountId2;

    @Column(name = "WISO_018_MERCHANTTYPE")
    private String wiso018MerchantType;

    @Column(name = "WISO_024_NETWORKID")
    private String wiso024NetworkId;

    @Column(name = "WISO_BITMAP")
    private String wisoBitmap;

    //////CAMPOS PARA LOS INPUTS DE FILTROS

    @Column(name = "WISO_012_LOCALDATETIME")
    private LocalDateTime wiso012LocalDateTime;

    @Column (name = "WISO_013_LOCALDATE")
    private LocalDateTime wiso013LocalDate;

}

