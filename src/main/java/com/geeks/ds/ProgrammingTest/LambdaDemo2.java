package com.geeks.ds.ProgrammingTest;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo2 {

    public static void main(String[] args) {
        List<String> elements = Arrays.asList("1","2","3","4");
        String result = elements.stream().reduce("",String::concat);
        System.out.println(result);
    }
}
