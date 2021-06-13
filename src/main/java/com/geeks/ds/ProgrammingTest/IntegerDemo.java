package com.geeks.ds.ProgrammingTest;

public class IntegerDemo {

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        try{
            int c = Math.addExact(a,b);
            System.out.println(c);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
