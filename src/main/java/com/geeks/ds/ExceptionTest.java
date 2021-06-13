package com.geeks.ds;

public class ExceptionTest {
    public Integer divide(Integer a , Integer b){
        try{
            return a/b;
        }finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
        try{
            System.out.println(test.divide(10,0));
        }catch (Exception ex){
            System.out.println("Division by 0");
        }
    }

}


