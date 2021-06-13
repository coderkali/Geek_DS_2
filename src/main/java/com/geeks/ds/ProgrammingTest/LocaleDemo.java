package com.geeks.ds.ProgrammingTest;

import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale locale = new Locale("USA");
        System.out.println("Country "+locale.getCountry());


        String str = "123";
        Integer.parseInt(str);

        char[] chars = str.toCharArray();
        char c='3';
        System.out.println((c-'0')+1);

    }
}
