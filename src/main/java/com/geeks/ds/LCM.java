package com.geeks.ds;

public class LCM {

    public static void main(String[] args) {
        System.out.println(findLcm(4,6));
        System.out.println(findLcm2(4,6));
    }


    //Naive Solution
    public static int  findLcm(int a , int b){

        int res = Math.max(a, b);
        while(true){
            if(res%a==0 && res%b==0){
                return res;
            }
           res++;
        }
    }

    //Effective soln
    public static int  findLcm2(int a , int b){
        return (a*b)/GCD.findGcd2(a,b);
    }


}
