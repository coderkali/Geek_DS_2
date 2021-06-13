package com.geeks.ds.hackerrank;

import java.util.Locale;

public class LocaleClassTest {

    public static void main(String[] args) {
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("GB").build();

        System.out.println(locale);

    }
}
