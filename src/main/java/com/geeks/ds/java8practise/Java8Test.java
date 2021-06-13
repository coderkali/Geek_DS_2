package com.geeks.ds.java8practise;

import java.util.Arrays;
import java.util.List;

public class Java8Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("dog","over","good");

        //System.out.println(list.stream().reduce(new Character(),(Character s1,s2) -> s1+ s2.));
        System.out.println(list.stream().reduce(new String(),(s1,s2) -> s1+ s2.charAt(0),(c1,c2)-> c1+=c2));
    }
}
