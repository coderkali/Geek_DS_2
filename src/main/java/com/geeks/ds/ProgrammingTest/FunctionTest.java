package com.geeks.ds.ProgrammingTest;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        Function<String,Integer> length = (s) ->s.length();
        Function<Integer,Boolean> condition = (i) -> i<10;
        Function<String,Boolean> condition1 = length.andThen(condition);
        System.out.println("The outcome is "+condition1.apply("Java 8"));

    }
}
