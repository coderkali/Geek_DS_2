package com.geeks.ds;

import java.util.Arrays;

public class ParkingDilema {

    public static int parkDimlema(int[] cars, int k) {
        // write your code here
        Arrays.sort(cars);
        int min = Integer.MAX_VALUE;
        for(int i=0;i+k-1<cars.length; i++)
            min = Math.min(min,(cars[i+k-1]-cars[i]+1));
        return min;

    }


    public static void main(String[] args) {
        int[] arr = {2,10,8,17};
        int[] arr1 = {1,2,3,10};
        //System.out.println(parkDimlema(arr,3));
        System.out.println(parkDimlema(arr1,4));
    }
}
