package com.geeks.ds;

public class PrimeNumberFactor {

    public static void main(String[] args) {
        //primeNumberFactor(12);
        //primeNumberFactor2(450);
        primeNumberFactor3(12);
    }

    public static void primeNumberFactor(int n){
        for (int i =2; i<n; i++){
            if(PrimeNumber.isPrime(i)){
                    int x = i;
                    while(n%x ==0){
                        System.out.println(i);
                        x = x*i;
                    }
            }
        }
    }

    //Effcient SOln

    public static void primeNumberFactor2(int n){
        if(n<=1){
            return;
        }
        for(int i=2; i*i <=n ; i++){
            while(n%i ==0){
                System.out.println(i);
                n= n/i;
            }
        }
        if(n>1){
            System.out.println(n);
        }
    }

    //More Effective Soln
    public static void primeNumberFactor3(int n){
        if(n<=1){
            return;
        }
        while(n%2 ==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3 ==0){
            System.out.println(3);
            n= n/3;
        }
        for(int i =5; i*i <=n ; i =i+6){
            while(n%i ==0){
                System.out.println(i);
                n=n/i;
            }
            while (n%(i/2)==0){
                System.out.println(i+2);
                n= n/(i+2);
            }
        }

        if(n>3){
            System.out.println(n);
        }

    }

}
