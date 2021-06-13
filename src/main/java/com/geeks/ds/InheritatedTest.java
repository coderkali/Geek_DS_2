package com.geeks.ds;

public class InheritatedTest {
    public void test(){
        System.out.println("qqqq");
    }
}
class Test123 extends  InheritatedTest {

}

class MainTest {
    public static void main(String[] args) {
        Test123 t = new Test123();
        doshape(t);

    }

    static void doshape(InheritatedTest test){
        test.test();
    }
}
