package com.geeks.ds.hackerrank;

import java.time.LocalDate;
import java.util.Calendar;

public class LeapYearCHeck {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }

    public static boolean isLeapYear(int year){
        //LocalDate date = LocalDate.of(year);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        int days = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
        return (days>365);


    }
}
