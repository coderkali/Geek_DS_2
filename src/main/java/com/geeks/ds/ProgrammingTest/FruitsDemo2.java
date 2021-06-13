package com.geeks.ds.ProgrammingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitsDemo2 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        Stream<String> fruitSTream = fruits.parallelStream();

        fruitSTream.filter(fruit -> {
            System.out.println("Fruit :"+fruit);
            return false;
        })
                .forEach(fruit -> { });

    }
}
