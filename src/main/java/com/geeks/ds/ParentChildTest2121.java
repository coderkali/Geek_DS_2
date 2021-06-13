package com.geeks.ds;

public class ParentChildTest2121 {
    private String value ="Parent";

    public String getValue() {
        return value;
    }
}

class Child333 extends ParentChildTest2121 {
    private String value ="Child";

    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        ParentChildTest2121 p = new Child333();
        //System.out.println(p.value +" & "+p.getValue());
    }
}
