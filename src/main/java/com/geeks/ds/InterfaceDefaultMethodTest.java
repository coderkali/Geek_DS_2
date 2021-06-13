package com.geeks.ds;

public interface InterfaceDefaultMethodTest {

    default void func1(){
        System.out.println("Tested");
    }
}

class Test12345 implements  InterfaceDefaultMethodTest {

//    @Override
//    public void func1(){
//        System.out.println("Tested1");
//    }

    public static void main(String[] args) {
        Test12345 test12345 = new Test12345();
        test12345.func1();

        InterfaceDefaultMethodTest i = new Test12345();
        i.func1();;

    }
}
