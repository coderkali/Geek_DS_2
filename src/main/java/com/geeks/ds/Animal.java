package com.geeks.ds;

public abstract class Animal {
    public abstract  void makeNoise();
    public abstract  void move();
}

abstract  class Canine extends Animal {
    public void wagTail(){
        System.out.println("Wagging");
    }

    @Override
    public void move(){
        System.out.println("Run");
    }
}

class Dog extends  Canine {
    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
    public void fetch(){
        System.out.println("fetch");
    }
}

class App {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeNoise();
        d.move();
        d.wagTail();
        d.fetch();

        Canine c = new Dog();
        c.makeNoise();
        c.move();
        c.wagTail();
        //c.fetch();  //this is the error

        Animal a = new Dog();
        a.makeNoise();
        a.move();
        //a.wagTail(); this is the error
    }
}
