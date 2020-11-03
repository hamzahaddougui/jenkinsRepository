package com.example.demo;

import com.example.demo.dao.FileInDetailRecord;
import com.example.demo.dao.FileOutDetailRecord;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DetailRecordItemProcessor implements ItemProcessor<FileInDetailRecord, FileOutDetailRecord> {

    @Value("${inputFileName}")
    public String originalFileName;
    //public JobExecution jobExecution;
    @Override
    public FileOutDetailRecord process(FileInDetailRecord item) throws Exception {

        FileOutDetailRecord fileOutDetailRecord = new FileOutDetailRecord();

        fileOutDetailRecord.setRecordType("DT");
        fileOutDetailRecord.setOriginalFileName(getFileName());
        fileOutDetailRecord.setOriginaRecordSequence(item.getRecordSequence());
        fileOutDetailRecord.setProcessResult("Processed");
        /*if(jobExecution.getStatus() == BatchStatus.COMPLETED)
        {
            fileOutDetailRecord.setProcessResult("P");
        }
        else if(jobExecution.getStatus() == BatchStatus.FAILED)
        {
            fileOutDetailRecord.setProcessResult("R");
        }*/
        String account="";
        account = item.getAccountNumber();


        fileOutDetailRecord.setAccountNumber(account);


        StringBuilder balance = new StringBuilder(item.getBalance());
        int position=0;
        for (int i = 0 ; i<balance.length() ; i++)
        {
            if (balance.charAt(i) == ',')
                position=i;
        }
        balance.setCharAt(position,'.');


        System.out.println(balance);
        double NewBalance = Double.parseDouble(balance.toString());

        double openTobuy = NewBalance-item.getFacilities()-item.getBlockedAmount()-100;
        fileOutDetailRecord.setOpenToBuy(openTobuy);





        return fileOutDetailRecord;
    }

    public String getFileName()
    {
    	
      String newOriginalFileName = originalFileName.substring(originalFileName.length()-6,originalFileName.length());
      return newOriginalFileName;
    }
}
