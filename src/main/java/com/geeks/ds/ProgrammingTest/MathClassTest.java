package com.geeks.ds.ProgrammingTest;

public class MathClassTest {

    public static void main(String[] args) {
        System.out.println(Math.round(10.55));  //this is correct
        System.out.println(Math.nextAfter(10.22,0.01));
        System.out.println(Math.random());
        System.out.println(Math.nextUp(10.22));
        System.out.println(Math.floor(10.99));
    }
}
