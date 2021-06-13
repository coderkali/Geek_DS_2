package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class ListTest345 {

    public static void main(String[] args) {
        List profiles = new ArrayList();
        profiles.add("manager");
        profiles.add("exce");
        profiles.add("eng");

        profiles.forEach(System.out::println);

    }
}
