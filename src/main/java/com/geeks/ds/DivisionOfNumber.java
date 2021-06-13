package com.geeks.ds;

public class DivisionOfNumber {
    public static void main(String[] args) {
        printDivision(15);
        System.out.println("----------------");
        printDivision2(15);
        System.out.println("----------------");
        printDivision3(15);
    }

    //Naive Soln
    static void printDivision(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    //Effective Soln
    static void printDivision2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);

                if (i != (n / i)) {
                    System.out.println(n / i);
                }
            }
        }
    }

    //More Effective Soln
    static void printDivision3(int n) {
        int i=1;
        for(i=1; i*i<n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

        for (;i>=1;i--){
            if(n%i==0){
                System.out.println(n/i);
            }
        }
    }

}
