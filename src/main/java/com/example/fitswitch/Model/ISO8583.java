package com.example.fitswitch.Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Where;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "ISO8583")

public class ISO8583 {

//Columnas proncipales a mostrar en el Front End
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
    private LocalDateTime wiso007TransDatetime;

    @Column(name = "WISO_002_PAN")
    private String wiso002Pan;

    //Columnas ordenadas de mayor a menor


    @Column(name = "WISO_004_AMOUNTTRANSACTION")
    private BigDecimal wiso004AmountTransaction;

    @Column(name = "WISO_008_BILLFEEAMOUNT")
    private BigDecimal wiso008BollFeeAmount;

    @Column(name = "WISO_011_SYSAUDITNUMBER")
    private String wiso011SysAuditNumber;

    //Filtros para los inputs

    @Column(name = "WISO_012_LOCALDATETIME")
    private LocalDateTime wiso012LocalDateTime;

    @Column(name = "WISO_013_LOCALDATE")
    private LocalDate getWiso013LocalDate;

    ////////////////////////////////////////////

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

    //Campos XML

//    @Lob
//    @Column(name = "WISO_114_EXTENDEDDATA")
//    private String wiso114ExtendedData;
//
//    @Lob
//    @Column(name = "WISO_115_EXTENDEDDATA")
//    private String wiso115ExtendedData;

    //////////////////////////

    @Column(name = "WISO_BITMAP")
    private String wisoBitmap;

    @Column(name = "WISO_TEMPOTRX_VALUE")
    private BigDecimal wisoTempoTrxValue;

    @Column(name = "WISO_TEMPOBDD_VALUE")
    private BigDecimal wisoTempoBddValue;

    @Column(name = "WISO_TEMPOAUT_VALUE")
    private BigDecimal wisoTempoAutValue;

    @Column(name = "WISO_IP")
    private String wisoIp;


    //getters and setters


    public String getWiso000MessageType() {
        return wiso000MessageType;
    }

    public void setWiso000MessageType(String wiso000MessageType) {
        this.wiso000MessageType = wiso000MessageType;
    }

    public String getWiso003ProcessingCode() {
        return wiso003ProcessingCode;
    }

    public void setWiso003ProcessingCode(String wiso003ProcessingCode) {
        this.wiso003ProcessingCode = wiso003ProcessingCode;
    }

    public String getWiso018MerchantType() {
        return wiso018MerchantType;
    }

    public void setWiso018MerchantType(String wiso018MerchantType) {
        this.wiso018MerchantType = wiso018MerchantType;
    }

    public String getWiso024NetworkId() {
        return wiso024NetworkId;
    }

    public void setWiso024NetworkId(String wiso024NetworkId) {
        this.wiso024NetworkId = wiso024NetworkId;
    }

    public LocalDateTime getWiso007TransDatetime() {
        return wiso007TransDatetime;
    }

    public void setWiso007TransDatetime(LocalDateTime wiso007TransDatetime) {
        this.wiso007TransDatetime = wiso007TransDatetime;
    }

    public String getWiso002Pan() {
        return wiso002Pan;
    }

    public void setWiso002Pan(String wiso002Pan) {
        this.wiso002Pan = wiso002Pan;
    }

    public BigDecimal getWiso004AmountTransaction() {
        return wiso004AmountTransaction;
    }

    public void setWiso004AmountTransaction(BigDecimal wiso004AmountTransaction) {
        this.wiso004AmountTransaction = wiso004AmountTransaction;
    }

    public String getWiso011SysAuditNumber() {
        return wiso011SysAuditNumber;
    }

    public void setWiso011SysAuditNumber(String wiso011SysAuditNumber) {
        this.wiso011SysAuditNumber = wiso011SysAuditNumber;
    }

    public BigDecimal getWiso008BollFeeAmount() {
        return wiso008BollFeeAmount;
    }

    public void setWiso008BollFeeAmount(BigDecimal wiso008BollFeeAmount) {
        this.wiso008BollFeeAmount = wiso008BollFeeAmount;
    }

    public LocalDateTime getWiso012LocalDateTime() {
        return wiso012LocalDateTime;
    }

    public void setWiso012LocalDateTime(LocalDateTime wiso012LocalDateTime) {
        this.wiso012LocalDateTime = wiso012LocalDateTime;
    }

    public LocalDate getGetWiso013LocalDate() {
        return getWiso013LocalDate;
    }

    public void setGetWiso013LocalDate(LocalDate getWiso013LocalDate) {
        this.getWiso013LocalDate = getWiso013LocalDate;
    }

    public String getWiso038AutorizationNumber() {
        return wiso038AutorizationNumber;
    }

    public void setWiso038AutorizationNumber(String wiso038AutorizationNumber) {
        this.wiso038AutorizationNumber = wiso038AutorizationNumber;
    }

    public LocalDateTime getWiso015SettlementDatel() {
        return wiso015SettlementDatel;
    }

    public void setWiso015SettlementDatel(LocalDateTime wiso015SettlementDatel) {
        this.wiso015SettlementDatel = wiso015SettlementDatel;
    }

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

    public String getWiso044AddrespData() {
        return wiso044AddrespData;
    }

    public void setWiso044AddrespData(String wiso044AddrespData) {
        this.wiso044AddrespData = wiso044AddrespData;
    }

    public String getWiso103AccountId2() {
        return wiso103AccountId2;
    }

    public void setWiso103AccountId2(String wiso103AccountId2) {
        this.wiso103AccountId2 = wiso103AccountId2;
    }

    public String getWiso102AccountId1() {
        return wiso102AccountId1;
    }

    public void setWiso102AccountId1(String wiso102AccountId1) {
        this.wiso102AccountId1 = wiso102AccountId1;
    }

//    public String getWiso114ExtendedData() {
//        return wiso114ExtendedData;
//    }
//
//    public void setWiso114ExtendedData(String wiso114ExtendedData) {
//        this.wiso114ExtendedData = wiso114ExtendedData;
//    }

//    public String getWiso115ExtendedData() {
//        return wiso115ExtendedData;
//    }
//
//    public void setWiso115ExtendedData(String wiso115ExtendedData) {
//        this.wiso115ExtendedData = wiso115ExtendedData;
//    }

    public String getWisoBitmap() {
        return wisoBitmap;
    }

    public void setWisoBitmap(String wisoBitmap) {
        this.wisoBitmap = wisoBitmap;
    }

    public BigDecimal getWisoTempoTrxValue() {
        return wisoTempoTrxValue;
    }

    public void setWisoTempoTrxValue(BigDecimal wisoTempoTrxValue) {
        this.wisoTempoTrxValue = wisoTempoTrxValue;
    }

    public BigDecimal getWisoTempoBddValue() {
        return wisoTempoBddValue;
    }

    public void setWisoTempoBddValue(BigDecimal wisoTempoBddValue) {
        this.wisoTempoBddValue = wisoTempoBddValue;
    }

    public BigDecimal getWisoTempoAutValue() {
        return wisoTempoAutValue;
    }

    public void setWisoTempoAutValue(BigDecimal wisoTempoAutValue) {
        this.wisoTempoAutValue = wisoTempoAutValue;
    }

    public String getWisoIp() {
        return wisoIp;
    }

    public void setWisoIp(String wisoIp) {
        this.wisoIp = wisoIp;
    }
}

