package com.geeks.ds;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Replace {

    public static void main(String[] args) {


        LinkedList<String> l = new LinkedList<>();
        l.add("Java");
        l.add("is");
        l.add("multithreaddd");
        l.add("and");
        l.add("platform");
        l.add("dependent");

        Collections.swap(l,2,6);

        for(String str: l){
            System.out.println(str);
        }

    }
}
