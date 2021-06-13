package com.geeks.ds.ProgrammingTest;


import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> checkEvent = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        } ;
    }
}
