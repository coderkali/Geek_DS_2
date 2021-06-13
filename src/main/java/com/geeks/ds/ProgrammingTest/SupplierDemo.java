package com.geeks.ds.ProgrammingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        List<String> users = new ArrayList<>();
        users.add("Jack");
        users.add("Jill");
        users.add("Ram");

        users.stream().forEach((name) -> {showSupplier(() ->name);
        });
    }

    public static void showSupplier(Supplier<String> name){
        System.out.println("Welcome "+name.get());
    }
}
