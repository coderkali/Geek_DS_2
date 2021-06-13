package com.geeks.ds.java8;

public class TrailingZero {

    public static void main(String[] args) {
        System.out.println(zeroCount(1000));
    }


    public static int zeroCount(int n){
        int result =0;
        for (int i= 5;i<=n;i=i*5){
            result = result + n/i;
        }
        return result;
    }
}
