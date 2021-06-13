package com.geeks.ds;

public class COnstructorTest {

    static String str;
    public void COnstructorTest(){
        System.out.println("In co");
        str = "Hello World";
    }

    public static void main(String[] args) {
        COnstructorTest c= new COnstructorTest();
        System.out.println(str);
    }
}
