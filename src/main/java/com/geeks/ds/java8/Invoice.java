package com.geeks.ds.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Invoice {

    public static String formatId(String oldId){
        return oldId + "_Invoice";
    }


    public static void main(String[] args) {
        LocalDateTime a = LocalDateTime.now();
        System.out.println(a);
        LocalDateTime t = a.plusSeconds(10);

        t.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();

        //System.out.println(t.);
    }
}
