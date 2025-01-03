package com.example.fitswitch.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

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

    ////CAMPOS PARA QUE SE USARAN PARA LOS INPUTS DEL FILTRADO
    @Column(name = "WISO_012_LOCALDATETIME")
    private LocalDateTime wiso012LocalDateTime;

    @Column (name = "WISO_013_LOCALDATE")
    private LocalDateTime wiso013LocalDate;

    ////////SON LOS DOS CAMPOS DE ARRIBA QUE SE USARAN PARA LOS FILTROS.


    ////getter and setters de campos obligatorios que piden.
    public String getWiso039ResponseCode() {
        return wiso039ResponseCode;
    }

    public void setWiso039ResponseCode(String wiso039ResponseCode) {
        this.wiso039ResponseCode = wiso039ResponseCode;
    }

    public String getWiso039pRespondeDetail() {
        return wiso039pRespondeDetail;
    }

    public void setWiso039pRespondeDetail(String wiso039pRespondeDetail) {
        this.wiso039pRespondeDetail = wiso039pRespondeDetail;
    }


    public String getWiso000MessageType() {
        return wiso000MessageType;
    }

    public void setWiso000MessageType(String wiso000MessageType) {
        this.wiso000MessageType = wiso000MessageType;
    }

    public String getWiso002Pan() {
        return wiso002Pan;
    }

    public void setWiso002Pan(String wiso002Pan) {
        this.wiso002Pan = wiso002Pan;
    }

    public String getWiso003ProcessingCode() {
        return wiso003ProcessingCode;
    }

    public void setWiso003ProcessingCode(String wiso003ProcessingCode) {
        this.wiso003ProcessingCode = wiso003ProcessingCode;
    }

    public String getWiso102AccountId1() {
        return wiso102AccountId1;
    }

    public void setWiso102AccountId1(String wiso102AccountId1) {
        this.wiso102AccountId1 = wiso102AccountId1;
    }

    public String getWiso103AccountId2() {
        return wiso103AccountId2;
    }

    public void setWiso103AccountId2(String wiso103AccountId2) {
        this.wiso103AccountId2 = wiso103AccountId2;
    }
}


