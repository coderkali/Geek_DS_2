package com.geeks.ds.hackerearth;

public class MyIuterClass {

    private int x= 1;
    public String st = "Number";

    public void inheritance(){
        MyInnerClass inner  = new MyInnerClass();
        inner.seeOuter();
    }

    public static void main(String[] args) {
        MyIuterClass o = new MyIuterClass();
        o.inheritance();
    }

    private class MyInnerClass {
        private void seeOuter(){
            System.out.println(st+" "+x);
        }
    }
}
