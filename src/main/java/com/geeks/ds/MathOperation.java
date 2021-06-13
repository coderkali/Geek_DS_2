package com.geeks.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathOperation {

    static int index =0;

    public static void main(String[] args) {
        List<MyTest> myTests = Arrays.asList(null,null);
        myTests.forEach(m -> System.out.println(m.calculate(args[index++],1,2)+ " "));
    }
}

class MyTest {
    public static int calculate(String choice, int a, int b){
        int c=3;
        switch (choice){
            case "ADD": c+=a+b;
            case "SUBSTRACT": c+=a-b;
            default: c+=a*b;
        }
        return c;
    }
}
