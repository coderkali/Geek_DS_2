package com.geeks.ds;

import java.util.Arrays;
import java.util.Comparator;

public class Compares {
    public static void main(String[] args) {
        String[] cities = {"Banglore", "Pune","San Franscio", "New Work City"};

        MyComparator mr = new MyComparator();
        Arrays.sort(cities,mr);
        System.out.println(Arrays.binarySearch(cities,"New Work City"));
    }

    static class MyComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}


