package com.geeks.ds.ProgrammingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> result = numbers.stream().skip(2).collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result.toString());
    }
}
