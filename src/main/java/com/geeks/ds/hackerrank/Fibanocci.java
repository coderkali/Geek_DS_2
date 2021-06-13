package com.geeks.ds.hackerrank;

public class Fibanocci {

    public static void main(String[] args) {
        System.out.println(isFibanocci(3));
        System.out.println(isFibanocci(4));
        System.out.println(isFibanocci(5));
        System.out.println(isFibanocci(8));
        System.out.println(isFibanocci(12));
    }


    public static boolean isFibanocci(int n){
        if(n ==0 || n==1){
            return true;
        }

        int a=0; int b=1;
        int count =0;

        while(count < n){
            int c = a+b;

            if(c == n){
                return true;
            }

            a=b;
            b=c;
            count++;

        }

        return false;

    }

}
