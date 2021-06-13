package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<Integer>  l = new ArrayList<>();
        for(int i=0; i<5; i++){

            l.add(i/2);
        }
        System.out.println(l);
    }
}
