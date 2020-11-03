package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class HeaderRecord {
    private String recordType;

    private  int recordSequence;

    private String systemDate;

    private String version;
}
