package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        String str ="";
        List<String> l1 = new ArrayList<>();
        l1.add("USA");
        l1.add("Australia");
        l1.add("China");
        l1.add("India");
        l1.add("2 4 6 8 10");


        for (String l : l1){
            str += l + "\n";
        }
        //System.out.println(str);
        String[] arr  = str.split("\n");
        StringBuilder sb = new StringBuilder();
        for(String str1 : arr){
            StringBuilder sb1 = new StringBuilder(str1);
            sb.append(sb1.reverse());
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
