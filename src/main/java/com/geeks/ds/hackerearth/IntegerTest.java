package com.geeks.ds.hackerearth;

public class IntegerTest {

    public static void main(String[] args) {
        Integer v1 = Integer.valueOf(34);
        Integer v2 = Integer.valueOf(34);

        System.out.println("" + (v1==v2));
        System.out.println("" + (v1.equals(v2)));

    }
}
