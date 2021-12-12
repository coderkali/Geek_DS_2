package com.geeks.ds;

import java.util.Arrays;

public class FirstTwoColor {

    public static void main(String[] args) {
        Arrays.asList("red","green","blue").
                stream().
                filter(s -> s.length()!=4).
                forEach(System.out::println);
    }
}
