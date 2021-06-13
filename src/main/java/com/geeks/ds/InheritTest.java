package com.geeks.ds;

public class InheritTest {

    public void m1(){
        System.out.println("this is m1");
    }

    protected void m2(){
        System.out.println("this is m2");
    }

    private void m3(){
        System.out.println("this is m3");
    }

     void m4(){
        System.out.println("this is m4");
    }
}

class BTest {
    public static void main(String[] args) {
        InheritTest i = new InheritTest();
        i.m1();
        i.m2();
        //i.m3();
        i.m4();

    }
}
