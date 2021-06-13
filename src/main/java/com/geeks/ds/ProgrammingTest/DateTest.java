package com.geeks.ds.ProgrammingTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) throws ParseException {
//        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
//        System.out.println(format.parse("02-03-2015"));


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toLocalTime());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());

        System.out.println(new Date());

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(new Date());
        System.out.println(calendar1.getTime());
    }
}
