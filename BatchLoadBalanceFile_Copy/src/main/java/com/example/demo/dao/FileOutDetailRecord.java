package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity

public class FileOutDetailRecord {


    private String recordType;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordSequence;

    private String originalFileName;

    private int originaRecordSequence;

    private String processResult;

    private String accountNumber;

    private double openToBuy;



}
