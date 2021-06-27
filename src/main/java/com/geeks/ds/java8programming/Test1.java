package com.geeks.ds.java8programming;

import java.io.*;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test1 {

    public static void main(String[] args) {
        Supplier<String> i = () -> "Car";
        Consumer<String> c= x -> System.out.print(x.toLowerCase());
        Consumer<String> d= x -> System.out.print(x.toUpperCase());
        c.andThen(d).accept(i.get());
        System.out.println();
    }


    public void fileRead() throws FileNotFoundException {
       // FileReader inputStream = new FileReader("input.dat");
       // BufferedReader inputStream = new BufferedReader(new InputStreamReader("input.dat"));
       //BufferedReader inputStream = new BufferedReader("input.dat");
       //BufferedReader inputStream = new BufferedReader(new File("input.dat"));
       BufferedReader inputStream = new BufferedReader(new FileReader("input.dat"));
    }
}
