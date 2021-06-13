package com.geeks.ds;

public class GCD {

    public static void main(String[] args) {
        System.out.println(findGcd(12,59));
        System.out.println(findGcd2(12,59));
    }

    public static int findGcd(int a, int b){
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }

    public static int findGcd2(int a, int b){
        if(b==0){
            return a;
        }
        return findGcd2(b,a%b);
    }
}
