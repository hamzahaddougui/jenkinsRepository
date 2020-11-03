package com.example.demo.dao;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;


@Data @AllArgsConstructor @NoArgsConstructor
public class FileInDetailRecord {

    private String recordType;

    private int recordSequence;

    private String bankCode;

    private String accountNumber;

    private String currencyCode;

    private String balance;

    private String accountBalanceSign;

    private double facilities;

    private double blockedAmount;

    private String cutoffBalanceDate;

    private String cutoffBalanceId;



}
