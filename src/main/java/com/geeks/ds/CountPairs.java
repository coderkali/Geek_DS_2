package com.geeks.ds;

import java.util.*;

class Pair {
    public Integer a;
    public int b;
    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String toString() {
        return "("+a+","+b+")";
    }
}


public class CountPairs {
    public static int countPairs(List<Integer> nums, int k) {
        Set<String> uniquePairs = new HashSet<>();
        int[] arr = nums.stream().mapToInt(i -> i).sorted().distinct().toArray();

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((k >= 0 ? arr[j] - arr[i] : arr[i] - arr[j]) == k)
                    uniquePairs.add(arr[i] + ":" + arr[j]);

        return uniquePairs.size();
    }

    public static void main(String[] args) {
        List<Integer> number =Arrays.asList(1,1,2,2,3,3);
        System.out.println(countPairs(number,1));
    }
}
