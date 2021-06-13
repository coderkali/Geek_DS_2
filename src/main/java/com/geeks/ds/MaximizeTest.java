package com.geeks.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximizeTest {

    public static int maximizeFinalElement(int arr[],
                                           int n)
    {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr[0] != 1)
            arr[0] = 1;

        for(int i = 1; i < n; i++)
        {
            if (arr[i] - arr[i - 1] > 1)
            {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[n - 1];
    }

    public static int max(List<Integer> arr, int n){
        Collections.sort(arr);
        if(arr.get(0) !=1){
            arr.add(0,1);
        }
       for(int i =1; i<n; i++){
           if(arr.get(i)-arr.get(i-1) >1){
               arr.add(i,arr.get(i-1)+1);
           }
       }
       return arr.get(n-1);
    }




    public static void main (String[] args)
    {

        int arr[] = { 15,9,1,5,15,3,3,4,6,9};
        int n = arr.length;

        int max1 = maximizeFinalElement(arr, n);
        System.out.print(max1);


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(15,9,1,5,15,3,3,4,6,9));
        int size = nums.size();

        int max = max(nums, size);
        System.out.print(max);
    }
}
