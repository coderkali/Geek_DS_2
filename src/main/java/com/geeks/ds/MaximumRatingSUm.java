package com.geeks.ds;

public class MaximumRatingSUm {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int tempSum = nums[0];

        for(int i = 1 ; i < nums.length ; ++i){
            tempSum = tempSum + nums[i];
            tempSum = Math.max(tempSum , nums[i]);
            if(tempSum > maxSum) {
                maxSum = tempSum;

            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] i = {-1,2,4,-2,5,-7};
        System.out.println(maxSubArray(i));

        int[] j = {-1,-2,1,3};
        System.out.println(maxSubArray(j));

        int[] k = {1,2,3,4};
        System.out.println(maxSubArray(k));
    }
}
