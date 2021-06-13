package com.geeks.ds;

public class ProductSum {

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0){
            int i = n%10;
            n /= 10;
            sum += i;
            product *= i;
        }
        return product - sum;
    }


    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(123456));
    }
}
