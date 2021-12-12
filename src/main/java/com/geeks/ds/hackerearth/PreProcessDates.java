package com.geeks.ds.hackerearth;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class PreProcessDates {


    public static List<String> reformatDate(List<String> dates) {
        // Write your code here
        List<String> outputDate = new ArrayList<>();

        try{
            for (String tempStr : dates){
                tempStr = tempStr.replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
                Date tempDate = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH).parse(tempStr);
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Calendar tempC = Calendar.getInstance();
                tempC.setTime(tempDate);
                int year = tempC.get(Calendar.YEAR);
                if (year >= 1900 && year <= 2100){
                    String dateStr = df.format(tempDate).toString();
                    outputDate.add(dateStr);
                } else {
                    System.out.println("Year out of range");
                }
            }
        } catch (Exception ex ){
            System.out.println(ex);
        }
        return outputDate;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1st Mar 1974");
        list.add("22nd Jan 2013");
        list.add("13th Oct 2017");
        list.add("15th Nov 1983");
        list.add("7th Apr 1904");

        PreProcessDates.reformatDate(list).forEach(System.out::println);


    }


}
