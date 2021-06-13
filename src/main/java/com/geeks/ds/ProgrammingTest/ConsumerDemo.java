package com.geeks.ds.ProgrammingTest;

import java.util.function.Consumer;

public class ConsumerDemo {


    public static void main(String[] args) {
        Consumer<String> consumer = ConsumerDemo::showCOnsumer;
        consumer.accept("Jack");
        consumer.accept("Jill");
        consumer.accept("Ram");
    }

    public static void showCOnsumer(String name){
        System.out.println("Welcome "+name);
    }
}
