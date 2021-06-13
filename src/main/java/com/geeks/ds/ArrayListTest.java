package com.geeks.ds;

import java.util.ArrayList;

public class ArrayListTest {
    private static void addPi(ArrayList<? super  Double> al){
        al.add(Math.PI);
    }

    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        ArrayList<Number> al1 = new ArrayList<>();
        addPi(al);
        addPi(al1);
        System.out.println(al.toString());
        System.out.println(al1.toString());

    }
}
