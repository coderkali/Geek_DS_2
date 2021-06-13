package com.geeks.ds;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("a");
        str.append("12345678912345678");
        System.out.println(str.length());
        System.out.println(str.capacity());
        //System.out.println(String[]::new);
    }
}
