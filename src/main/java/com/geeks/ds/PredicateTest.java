package com.geeks.ds;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        PredicateTest  t = new PredicateTest();
        t.test();
    }

    public void test(){
        System.out.println(booleaner.compose(stringer).apply("true").substring(0,3));
        System.out.println(stringer.compose(booleaner).apply(true));
        //System.out.println(booleaner.andThen(stringer).apply("true"));
        System.out.println(lengther.negate().or(equalizer).test("CAR"));
        System.out.println(booleaner.apply(true));
    }



    Predicate<String> lengther = (s) -> s.length() <2;
    Predicate<String> equalizer = Predicate.isEqual("car");
    Function<Boolean,String> booleaner = i -> Boolean.toString(i);
    Function<String,Boolean> stringer =  s -> Boolean.parseBoolean(s);

}
