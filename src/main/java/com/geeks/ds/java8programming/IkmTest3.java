package com.geeks.ds.java8programming;

public class IkmTest3 {

    public IkmTest3(){
        this(10);
    }

    public IkmTest3(int data){
        this.data =data;
    }

    public void display(){
        class Decremeter {
            public void decrement () {
                data--;
            }
        }
        Decremeter d = new Decremeter();
        d.decrement();;
        System.out.println("data ="+data);
    }

    private int data;

    public static void main(String args[]) {
        int data =0;
        IkmTest3 i = new IkmTest3();
        i.display();
        System.out.println("data ="+data);
    }

//    static public  void main(String... args) {
//        System.out.println("test");
//    }
}
