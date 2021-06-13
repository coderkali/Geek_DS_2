package com.geeks.ds;

import java.util.function.Consumer;

public class StringBufferTest123 {

    public static boolean outPut(Integer a){
        return Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }

    public static void main(String[] args) {
        Consumer<String> print = x -> System.out.println(x);
        print.accept("Java");
        System.out.println(outPut(2));
    }
}
