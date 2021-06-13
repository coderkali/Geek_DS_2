package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class DigitsManipulation {

    public static void main(String[] args) {
        int n=123456;
        System.out.println(productOfNumber(n,false,1)-productOfNumber(n,true,0));


        List<String> l = new ArrayList<>();

        //l.stream().collect();

    }

     static int productOfNumber(int n, boolean isAdd,int intial){
        int product=intial;
       while(n!=0){
           if(isAdd){
               product = product + (n%10);
           }else {
               product = product * (n%10);
           }

           n = n/10;
       }
        System.out.println(product);

       return product;

    }
}
