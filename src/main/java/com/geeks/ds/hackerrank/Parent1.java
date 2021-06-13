package com.geeks.ds.hackerrank;//package com.geeks.ds.hackerrank;
//
//import java.io.BufferedReader;
//
//final class Parent {
//
//    BufferedReader reader;
//
//    protected int age;
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("finalize() was executed in Parent class");
//    }
//}
//
//class Child extends Parent {
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("finalize() was executed in Child class");
//    }
//
//    int compare(Parent parent){
//        try{
//            if(age >= parent.age){
//                throw new IllegalArgumentException("Child can't be older than parent");
//            }
//            return age - parent.age;
//        }finally {
//            System.out.println("Child age: "+age);
//        }
//    }
//
//    final int gender(){
//        return 0;
//    }
//
//}
//
//class Son extends Child {
////    @Override
////    final int gender(){
////        return -1;
////    }
//}
//
//class Daughter extends Child {
////    @Override
////    int gender(){
////        return 1;
////    }
//}
