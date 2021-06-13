package com.geeks.ds.java8;

public class OuterClass {

    public String xyz;

    public  void test1(){
        //abc = "";
    }


    class InnerClass {
        public String abc;

        public void test(){
            abc = "";
            xyz = "";
        }
    }
}
