package com.geeks.ds;

import java.util.ArrayList;
import java.util.List;

public class Asteroid {

    private String name;
    private double diameter;

    public Asteroid(String name, double diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return String.format("%s [%.2f]",getName(),getDiameter());
    }

    public static void main(String[] args) {
        List<Asteroid> a = new ArrayList<>();
        a.add(new Asteroid("Sylvia",286));
        a.add(new Asteroid("Pallas",512));
        a.add(new Asteroid("Eunomia",268));
        a.add(new Asteroid("Juno",258));
        a.add(new Asteroid("Hygiea",431));
        a.add(new Asteroid("Davida",289));

        Asteroid x =a.stream()
                .reduce(a.get(0),(a1,b) -> a1.getDiameter()> b.getDiameter() ? a1 :b);

        System.out.println(x);


    }
}



