package com.geeks.ds.java8programming;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

public class Test2 {

    @Override
    public String toString(){
        return "ObjectDemo";
    }

    public static void main(String[] args) {
        Optional<Object> o = Optional.of(new Test2());
        System.out.println(o.get().toString());

        //ResourceBundle bundle = ResourceBundle.getBundle("Message", new Locale("zh","CN"));
    }
}
