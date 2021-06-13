package com.geeks.ds.java8;

public class ForLoopTest {

    public static void main(String[] args) {
        int i=0, j =12;

        Runnable r =  () -> System.out.println("Hi");
        new Thread(r).start();
//        for (;;){
//            if(i++ < j--){
//                continue;
//            }else{
//                break;
//            }
//            //System.out.println(i+" "+j);
//        }
    }
}
