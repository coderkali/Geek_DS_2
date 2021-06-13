package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodRefactor {

    static void populate(Supplier<List> s, String... stuff){
        List l = s.get();
        for(int i =0; i<stuff.length; ++i){
            l.add(stuff[i]);
        }
        System.out.println(l);
    }


    public static void main(String[] args) {
        MethodRefactor m = new MethodRefactor();
        populate(ArrayList::new,"Red","green","Blue");



    }
}
