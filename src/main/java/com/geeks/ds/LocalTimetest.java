package com.geeks.ds;

import java.time.LocalTime;
import java.util.Calendar;

public class LocalTimetest {

    public static void main(String[] args) {
        System.out.println(String.format("Local Time: %tT", LocalTime.now()));
        System.out.println(String.format("Local Time: %tH:%tM:%tS", LocalTime.now(),LocalTime.now(),LocalTime.now()));
        System.out.println(String.format("Local Time: %1$tB", Calendar.getInstance()));
        System.out.println(String.format("Local Time: %tT", Calendar.getInstance()));
        System.out.println(String.format("Local Time: %tT", Calendar.getInstance().toString()));
    }
}
