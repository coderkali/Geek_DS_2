package com.geeks.ds;

public class NewStringTest {

    public static void main(String[] args) {
        //String myString = (String)1;  --> This is the answer
        //String myString = String.toString(1); --> This is the answer
        String myString1 = new Integer(1).toString();
        String myString2 ="1";
        String myString3 =String.valueOf(1);
    }
}
