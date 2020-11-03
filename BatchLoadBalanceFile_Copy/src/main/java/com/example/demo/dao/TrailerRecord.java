package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class TrailerRecord {

    private String recordType;
    private int recordSequence;
    private int recordsCount;
}
