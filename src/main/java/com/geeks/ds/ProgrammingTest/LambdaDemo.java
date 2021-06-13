package com.geeks.ds.ProgrammingTest;

public class LambdaDemo {

    public static void main(String[] args) {
        printMyName("jack");
    }

    public static void printMyName(String name){
        name = name+"Nelson";
        Runnable r = () -> {
            try{
              Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            //System.out.println("Welcome "+name);
        };
    }
}
