package com.geeks.ds.java8;

public class ShapeClass {


}

class Quadrilitrial extends ShapeClass {

}

class Triangerial extends ShapeClass {

}

class Main {
    public static void main(String[] args) {
        ShapeClass shape = new Quadrilitrial();
        Quadrilitrial quadrilitrial = new Quadrilitrial();

        //Triangerial tri = (Triangerial) quadrilitrial;
        //Triangerial tri = (Triangerial) shape;  //Thrown Exception
        //shape = quadrilitrial; // is not throwing any exception
        //Triangerial tri = (Triangerial) shape;
        //Triangerial tri = (Triangerial) quadrilitrial;

        // Correct answer is
        // The statement Triangerial tri = (Triangerial) quadrilitrial; will fail to compile
        // The statement Triangerial tri = (Triangerial) shape; // will thrown an exception at runtime



    }
}

