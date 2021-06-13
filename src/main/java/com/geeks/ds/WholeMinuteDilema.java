package com.geeks.ds;

import java.util.HashMap;

public class WholeMinuteDilema {

    public static void main(String[] args) {
        int[] i = {10,50,90,30};
        System.out.println(numPairsDivisibleBy60(i));
    }

    public static long numPairsDivisibleBy60(int[] time) {

        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int t : time){
            t = t % 60;
            int complement = (60 - t) % 60;

            count += map.getOrDefault(complement, 0); //[30,20,20,40] -> 40's complement 20 occurs 2 times so 40 can pair with 20 twice

            map.put(t, map.getOrDefault(t, 0) + 1);
        }

        return count;

    }
}
