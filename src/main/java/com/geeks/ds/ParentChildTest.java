package com.geeks.ds;

public class ParentChildTest {
    {
        System.out.println("A");
    }
    static{
        System.out.println("B");
    }

}

class Child extends  ParentChildTest {
    {
        System.out.println("C");
    }
    static{
        System.out.println("D");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
