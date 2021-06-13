package com.geeks.ds;

public class ComputingPower {

    public static void main(String[] args) {
        System.out.println(solution1(3,5));
        System.out.println(solution(3,5));
        System.out.println(solution2(4,5));
    }


    public static int solution(int x,int n){
        int res=1;
        for(int i=0;i<n;i++){
            res = res *x;
        }
        return res;
    }

    //Effective SOln
    public static int solution1(int x,int n){
        if(n==0){
            return 1;
        }
        int temp = solution1(x,n/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;
        }else{
            return temp*x;
        }
    }


    public static int solution2(int x,int n){
        int res=1;
        while(n>0){
            if(n%2!=0){
                res = res *x;
            }
            x= x*x;
            n= n/2;
        }
        return res;
    }


}
