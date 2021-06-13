package com.geeks.ds;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(1031));
        System.out.println(isPrime2(1031));
        System.out.println(isPrime3(1031));
    }

    //Naive Soln
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }

    //Effective Soln
    public static boolean isPrime2(int n) {
        if (n == 1) {
            return false;
        }

        for(int i =2; i*i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //More Effective soln
    public static boolean isPrime3(int n) {
        if (n == 1) {
            return false;
        }
        if(n==2 || n==3){
            return true;
        }

        if(n%2==0 || n%3==0){
            return false;
        }

        for(int i =5; i*i<n; i =i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    }
