package com.geeks.ds.java8programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SandBox {
}

class MethodRefecor {

    static void populate(Supplier<List> s, String... stuff){
        List l = s.get();
       for (int i=0; i<stuff.length;++i){
          // s.add(stuff[i]);
           l.add(stuff[i]);

       }
        System.out.println(l);
    }

    public static void main(String[] args) {
        MethodRefecor mrc = new MethodRefecor();
        populate(ArrayList::new,"Red","Green","Blue");
    }
}
