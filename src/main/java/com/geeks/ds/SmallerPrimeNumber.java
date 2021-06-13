package com.geeks.ds;

import java.util.Arrays;

public class SmallerPrimeNumber {

    public static void main(String[] args) {
        solutuion1(15);
        solution2(15);
        solution3(15);
    }

    static void solutuion1(int n){
        for(int i=2; i<=n; i++){
            if(PrimeNumber.isPrime(i)){
                System.out.println(i);
            }
        }
    }

   // Effective Soln Time Complexity O(nlognlogn)
    static void solution2(int n){
        if(n <= 1)
            return;

        boolean isPrime[] = new boolean[n+1];

        Arrays.fill(isPrime, true);

        for(int i=2; i*i <= n; i++)
        {
            if(isPrime[i])
            {
                for(int j = 2*i; j <= n; j = j+i)
                {
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i<=n; i++)
        {
            if(isPrime[i])
                System.out.print(i+" ");
        }
    }

    //more simplefied soln
    static void solution3(int n) {
        if (n <= 1)
            return;

        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i+" ");
                for(int j = i*i; j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }

    }
}
