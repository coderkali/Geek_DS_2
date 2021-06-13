package com.geeks.ds.ProgrammingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest2 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(10,40,20,60,80,0,80,30,40)
                .stream()
                .filter(value -> value > 18)
                .sorted()
                .sequential()
                .map(Integer::new)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(values.toString());
    }
}
