package com.geeks.ds.java8programming;




public class JvmHeapSIze {

    public static void main(String[] args) {
        System.out.println("Current JVM Heap Size ::"+ Runtime.getRuntime().totalMemory());
        System.out.println("Current JVM Heap Size ::"+ Runtime.getRuntime().maxMemory());
        System.out.println("Current JVM Heap Size ::"+ Runtime.getRuntime().freeMemory());



    }
}
