package com.geeks.ds.java8practise;

import java.io.File;
import java.io.FileReader;

public class MyClass_1 {
    File aFile;
    MyClass_1(){
        MyOtherClass otherClass = new MyOtherClass();
    }


    public static  void main(String [] args) {
         System.out.println("Hello");
    }

}

class MyOtherClass {
    FileReader aReader;
    MyOtherClass(){}
}
