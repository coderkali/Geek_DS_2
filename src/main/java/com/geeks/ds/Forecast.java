package com.geeks.ds;

public class Forecast {
    public int temprature;
    public int pressure;
}

class MainTest123555 {
    public static void changeTheString(String weather){
        weather ="sunny";
    }

    public static void changeTheArray(String[] rainyDays){
        rainyDays[1] ="Sunday";
    }

    public static void changeTheObject(Forecast rainyDays){
        rainyDays.temprature =35;
    }

    public static void main(String[] args) {
        String weather = "rainy";
        changeTheString(weather);
        System.out.println("The weather is "+weather);

        String[] rainyDay = new String[]{"Monday","Friday"};
        changeTheArray(rainyDay);
        System.out.println("The rainy Day were in "+rainyDay[0]+" and"+rainyDay[1]);

        Forecast forecast = new Forecast();
        forecast.pressure =700;
        forecast.temprature =20;

        changeTheObject(forecast);
        System.out.println("The temprature is ::"+forecast.temprature+" C");
    }



}
