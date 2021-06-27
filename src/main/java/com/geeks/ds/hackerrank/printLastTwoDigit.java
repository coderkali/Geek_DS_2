package com.geeks.ds.hackerrank;

import java.util.Arrays;
import java.util.List;

public class printLastTwoDigit {

    public static int solve(List<Integer> arr){
        Integer reduce = arr.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce);
        System.out.println(1000%100);

        return 0;
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(25,10);
        System.out.println(solve(l));
    }
}
