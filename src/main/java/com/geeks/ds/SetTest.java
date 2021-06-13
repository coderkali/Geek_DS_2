package com.geeks.ds;

import java.util.*;

public class SetTest {


    public static void main(String[] args) {
        Set<Integer> i = new HashSet<>();
        i.add(1);
        i.add(2);
        i.add(9);
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(1);
        i.add(4);
        i.add(1);
        i.add(5);
        i.add(7);

        List<Integer> l = new ArrayList<>(i);
        Collections.sort(l);
        l.forEach(System.out::println);
    }
}
