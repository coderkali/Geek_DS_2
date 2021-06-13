package com.geeks.ds.java8programming;


import com.geeks.ds.java8.A;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Parallel {

    public static void main(String[] args) {

        Stream.of("little","red","riding","hood")
                .parallel()
                .map(s -> {
                    System.out.println("map: "+ s +" "+ Thread.currentThread().getName());
                    return s + "_";
                })
                .filter(s -> {
                    System.out.println("filter: "+ s + " "+Thread.currentThread().getName());
                    return s.length()>3;
                })
                .reduce((s1,s2) -> {
                    System.out.println("reducer:"+s1+" "+Thread.currentThread().getName());
                    return s1.length() > s2.length() ? s1 : s2;
                });


        AsyncWork myWOrk = new AsyncWork();
        Thread thread = new Thread(myWOrk);
        thread.start();


    }






    static class AsyncWork implements Runnable {

        @Override
        public void run() {
            System.out.println("hello");
        }
    }
}
