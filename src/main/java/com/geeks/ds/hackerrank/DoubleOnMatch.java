package com.geeks.ds.hackerrank;

public class DoubleOnMatch {

    static int findValue(int arr[], int n, int k)
    {

        // Search for k. After every successful
        // search, double k.
        for (int i = 0; i < n; i++)
            if (arr[i] == k)
                k *= 2;

        return k;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,1,2 }, k = 2;
        int n = arr.length;
        System.out.print(findValue(arr, n, k));
    }
}
