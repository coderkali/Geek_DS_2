package com.geeks.ds.java8programming;

public class LongTest {

    public static void main(String[] args) {
        Long l = new Long(1234);
        Long l1 =l;

        if(l == l1){
            System.out.println("Equal Objects");
        }else{
            System.out.println("Not Equal Objects");
        }
        l++;
        if(l == l1){
            System.out.println("Equal Objects");
        }
        else{
            System.out.println("Not Equal Objects");
        }
    }
}
