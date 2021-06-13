package com.geeks.ds;

public class OutPut {

    public static void main(String[] args) {
        Object[] names = new String[3];
        names[0] = new Integer(0);


        int a=1;
        int b=2;
        int c=3;
        a |=4;
        b>>=1;
        c <<=1;
         a ^=c;
        System.out.println(a+" "+b+" "+c);

    }
}
