package com.geeks.ds.hackerrank;

public class IKMTest44 {

    public static void main(String[] args) {
        System.out.println(calc(5));
    }

    public static int calc(int x){
        if(x==0){
            return 1;
        }else{
            return x * calc(x-1);
        }
    }
}
