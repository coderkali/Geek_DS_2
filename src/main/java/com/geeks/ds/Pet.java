package com.geeks.ds;

public class Pet {

    public String getName(){
        return "pet";

    }
}

class Cat extends Pet {

    @Override
    public String getName(){
        return "Cat";
    }
}

class Shape {
    private String name;
    public Shape(){
        name ="shape";
    }

    public String getName(){
        return name;

    }
}

class Ball extends Shape {
    private String name;
    public Ball(){
        name = "ball";
    }


}
class MainTest555 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        Ball ball = new Ball();

        System.out.println(String.format("MY %s is playing with a %s", pet.getName(), ball.getName()));
    }
}
