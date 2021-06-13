package com.geeks.ds.java8;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public interface I1 {

    String name  = "N1";
    String s1 = "S1";

}

interface  I2 extends  I1{
    String name = "N2";
}

class C2 implements  I2 {
    public static void main(String[] args) {
          System.out.println(I2.name+",");
          System.out.println(I2.s1+",");
          System.out.println(((I1)new C2()).name);
//
//
//        System.out.println(Math.nextAfter(10.22,0.01));



        Date aDate =new Date();
        Calendar aCalendar = Calendar.getInstance();
        aCalendar.setTimeInMillis(1450000000000L);
        aDate= aCalendar.getTime();
        System.out.println(new SimpleDateFormat("dd-MMM-yyyy").format(aDate));


        Instant aInstant = Instant.ofEpochMilli(1450000000000L);
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        System.out.println(" "+ LocalDateTime.ofInstant(aInstant, ZoneId.systemDefault()).format(d));


        aCalendar.add(Calendar.DAY_OF_MONTH,60);

        aDate = aCalendar.getTime();
        System.out.println(new SimpleDateFormat("dd-MMM=yyy").format(aDate));



        int x= 3;
        boolean b1 = true;
        boolean b2 = false;
        if((b1 | b2) || (x++>4)) {
            System.out.println("x1: "+x++);
        }
        if((!b1 & b2) && (++x<4)){
            System.out.println(" x2: "+x);
        }









    }



}
