package com.geeks.ds;

public class ProductOfSubArray {

    static int countSubArrayWithOddProduct(int A[],
                                           int N)
    {
        int count = 0;
        int last = -1;
        int K = 0;
        for(int i = 0; i < N; i++)
        {
            if (A[i] % 2 == 0)
            {
                 K = (i - last - 1);
                 count += (K * (K + 1) / 2);
                 last = i;
            }
        }
        K = (N - last - 1);
        count += (K * (K + 1) / 2);
        return count;
    }

    public static void main(String args[])
    {
        int arr[] = { 1,1,1,2 };
        int n = arr.length;

        // Function call
        System.out.println(countSubArrayWithOddProduct(arr, n));
    }
}
