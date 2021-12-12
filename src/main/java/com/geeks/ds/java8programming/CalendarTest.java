package com.geeks.ds.java8programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {
        System.console();
        Date aDate = null;
        try{
            aDate = new SimpleDateFormat("yyyy-mm-dd").parse("2012-01-15");
            Calendar aClaendar = Calendar.getInstance();
            aClaendar.setTime(aDate);
            System.out.println(aClaendar.get(aClaendar.DAY_OF_MONTH)+","+aClaendar.get(aClaendar.MONTH));

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate bDate = LocalDate.parse("2012-01-15",formatter);
            System.out.println(" "+bDate.getDayOfMonth()+" "+bDate.getMonthValue());
        }catch(ParseException ex){
            System.out.println("ParseException "+ex);
        }catch(DateTimeParseException ex){
            System.out.println("DateTimeParseException "+ex);
        }
    }
}
