package com.geeks.ds.ProgrammingTest;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class TimeZoneTest {

    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);

        LocalDateTime dateTime2 = LocalDateTime.now();
        System.out.println(dateTime2);

        OffsetDateTime dateTime1 = OffsetDateTime.now();
        System.out.println(dateTime1);

        System.out.println(Calendar.getInstance().getTime());


    }
}
