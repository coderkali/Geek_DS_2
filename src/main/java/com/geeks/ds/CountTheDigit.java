package com.geeks.ds;

public class CountTheDigit {


    public static void main(String[] args) {
        System.out.println(count(123L));
    }


    public static int count(Long number){
        if(number==0){
            return 0;
        }
        return 1+ count(number/10);
    }
}
