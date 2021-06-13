package com.geeks.ds.java8programming;

public interface MyInterface {
    void method1();
    static void method2(){};

    default void myMethod() {

    }
}

abstract  class MyClass implements  MyInterface {
    abstract public void myMethod();
}


