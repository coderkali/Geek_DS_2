package com.geeks.ds;

class ClassTest {
    public static void main(String[] args) {
        System.out.println("Class A "+args[0]);
    }
}


class ClassTestB {
    public static void main(String[] args) {
        System.out.println("Class B ");
        ClassTest.main(args);
    }
}
