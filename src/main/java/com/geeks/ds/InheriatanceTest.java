package com.geeks.ds;

class A1{}
class B1 extends A1{}
class C1 extends B{}


public class InheriatanceTest {

    B1 b = new B1();

    public void test(){
        System.out.println((b instanceof B1));
        System.out.println((b instanceof B1) && (!(b instanceof  A1)));
        //System.out.println((b instanceof B1) && (!(b instanceof C1)));
    }

    public static void main(String[] args) {
        InheriatanceTest t = new InheriatanceTest();
        t.test();
    }
}
