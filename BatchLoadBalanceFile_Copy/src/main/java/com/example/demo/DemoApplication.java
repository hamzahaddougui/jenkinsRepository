package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@SpringBootApplication
public class DemoApplication {
    /*String file = resource;
    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

    ArrayList<String> lines = new ArrayList<String>();
    ArrayList<Integer> chars = new ArrayList<Integer>();

    String line ="";

        while ((line = bufferedReader.readLine()) != null)
    {
        lines.add(line);
        int character = line.length();
        chars.add(character);
    }
        bufferedReader.close();
    int size = lines.size();

        for( int count=1 ; count<size-1 ; count++)
    {
        String characters =  lines.get(count);

        String newCharacters = characters.substring(0,3);

        System.out.println(newCharacters);
        System.out.println(chars.get(count));
    }

     */

    String file="C:/20200414_ISS_DBT_BAL_20200417210000.csv";

    public DemoApplication()  {
    }

    public void generateFile() throws IOException {
        /*ArrayList<String> lines = new ArrayList<String>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String newOriginalFileName = file.substring(3,file.length()-4);*/
        PrintWriter writer = new PrintWriter("C:\\Users\\lp-09hCbnWA3T5h6\\Documents\\HPS\\batch_test_files\\1000000.csv", "UTF-8");
        String line="DT0000000000000000002ISS0035222485497800000000000011230000100000000,1574C000000000000010000000000000000010000202004192100001234560000" ;

        for(int count=0; count<1000000;count++)
        {
            writer.println(line);
        }


        writer.close();
        }





    public static void main(String[] args) throws IOException {

        SpringApplication.run(DemoApplication.class, args);
        //DemoApplication demoApplication = new DemoApplication();
        //demoApplication.generateFile();

    }

}
