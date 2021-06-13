package com.geeks.ds;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TestClass {

    public static void main(String[] args) {
        NavigableMap<String,String> nmpa = new TreeMap<>();
        nmpa.put("a","apple");
        nmpa.put("b","boy");
        nmpa.put("c","cat");
        nmpa.put("aa","apple1");
        nmpa.put("bb","boy1");
        nmpa.put("cc","cat1");

        nmpa.pollLastEntry();
        nmpa.pollFirstEntry();

        NavigableMap<String,String> tailMap = nmpa.tailMap("bb",false);


        System.out.println(tailMap.pollFirstEntry());
        System.out.println(nmpa.size());

    }
}
