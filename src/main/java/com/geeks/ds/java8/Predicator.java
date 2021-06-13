package com.geeks.ds.java8;

import javax.sound.midi.Soundbank;
import javax.sql.rowset.Predicate;
import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Stream;

public class Predicator {

    static ArrayList<Integer> al;

    static {
        al = new ArrayList<Integer>(100);
    }

    public static void main(String[] args) throws FileNotFoundException {

//        FileReader inputStream = new FileReader("input.dat");
//
//        //BufferedReader bufferReader = new BufferedReader("input.dat");
//
//        BufferedReader bufferReader = new BufferedReader(new FileReader("input.dat"));
//
//        //BufferedReader bufferReader1 = new BufferedReader(new File("input.dat"));
//
//       // BufferedReader bufferReader2 = new BufferedReader(new InputStreamReader("input.dat"));


        System.out.println(Stream.of("green","yellow","blue")
                             .max(String::compareTo)
                             .filter(s -> s.endsWith("n"))
                .orElse("yellow"));


        int a =9, b=2;

        float f;

        f = a/b;

        System.out.println("f = "+f);
        f= f/2;
        System.out.println("f = "+f);
        f = a+b/f;
        System.out.println("f = "+f);


        SortedSet<Elements> s = new TreeSet<Elements>();

        s.add(new Elements(15));
        s.add(new Elements(10));
        s.add(new Elements(25));
        s.add(new Elements(10));
        System.out.println(s.first() + " "+s.size());


        Integer number1 = new Integer(1);

        Integer number2 = number1;

        number1+=1;
        System.out.println("Number 1::"+number1);
        System.out.println("Number 2::"+number2);

       // ResourceBundle bundle = ResourceBundle.getBundle("Message",new Locale("zh","CN"));


        //Math.abs()


        LocalDate localDate = LocalDate.of(2015,4,4);

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd,yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("E,MMM dd,yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));


        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = YearMonth.of(2016, Month.MARCH);

        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
        System.out.println(ym2.compareTo(ym1));
        System.out.println(ym2.until(ym1, ChronoUnit.MONTHS));
        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
       // System.out.println(ym1.until(ym2));





    }

    private String test1;

    public void abc(){
        //System.out.println(test);
    }



    class Inner {
        public String test;

        public void tested(){
            System.out.println(test1);
        }
    }

    public void m4(){

    }
    protected void m1(){

    }
}

class Elements implements Comparable {

    Predicator p = new Predicator();


        int id;

    public Elements(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
       Elements e = (Elements)o;
       return this.id = e.id;
    }

    public String toString(){
        return ""+ this.id;
    }
}


