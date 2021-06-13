package com.geeks.ds.ProgrammingTest;

import java.util.stream.Stream;

public class FruitsDemo {

    public static void main(String[] args) {
        Stream.of("Mango","Orange","Banana")
                .filter(fruit -> {
                    System.out.println("Fruit: "+fruit);
                    return true;
                });
    }
}
