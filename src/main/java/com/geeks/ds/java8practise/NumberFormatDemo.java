package com.geeks.ds.java8practise;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatDemo {

    public static void main(String[] args) throws ParseException {
        String s = "123.456789d";
        double d = 123.456789;
        NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat ne = NumberFormat.getInstance(Locale.ENGLISH);
        nf.setMaximumFractionDigits(2);
        ne.setMaximumFractionDigits(3);
        System.out.println(nf.format(d) + " ");
        System.out.println(ne.format(d) + " ");
        try {
            System.out.println(nf.parse(s));
            System.out.println(ne.parse(s));

        }catch (Exception e){
            System.out.println(e.getClass());
        }


    }
}
