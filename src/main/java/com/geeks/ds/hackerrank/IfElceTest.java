package com.geeks.ds.hackerrank;

public class IfElceTest {

    public static void main(String[] args) {
          IfElceTest elceTest = new IfElceTest();
          elceTest.foo(false,false);
    }

    public void foo(boolean a, boolean b){
        if(a){
            System.out.println("A");
        }else if(a && b){
            System.out.println("A && B");
        }else {
            if(!b){
                System.out.println("notB");
            }
            else {
                System.out.println("ELSE");
            }
        }
    }
}
