package com.geeks.ds.startegy;

import java.util.function.Function;

public class StartegyTest {


    public static void main(String[] args) {

        Startegy startegy = new Startegy(new CreditCardStartegy());

        System.out.println(startegy.getTransaction("CreditCard"));


        //Using Lambda

        Function<String,String>  giftCardFunction = str -> {

            return "This is from GiftCard Block";
        };

        StartegyWithFunctional startegyWithFunctional = new StartegyWithFunctional(giftCardFunction);
        System.out.println(startegyWithFunctional.getTransaction("giftcard"));






    }
}
