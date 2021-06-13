package com.geeks.ds;

public class AddTwoNumber {

    public static void main(String[] args) {
        Float f1 = 508519.5f;
        Float f2 = 409639.12f;
        // returns the sum of f1 and f2
        Float f3 = Float.sum(f1,f2);
        System.out.println(f3);

        System.out.println(Math.round(f3));
    }
}
