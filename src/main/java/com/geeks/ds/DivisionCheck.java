package com.geeks.ds;

public class DivisionCheck {

    public static void main(String[] args) {
        double d = 10.0/ -0;
        if(d == Double.POSITIVE_INFINITY){
            System.out.println("Positive Infinity");
        }else{
            System.out.println("negative Infinity");
        }
    }
}
