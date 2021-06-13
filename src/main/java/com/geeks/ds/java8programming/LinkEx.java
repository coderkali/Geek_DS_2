package com.geeks.ds.java8programming;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkEx {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("3");
        set.add("1");
        set.forEach(s -> System.out.print(s+"-"));
    }
}
