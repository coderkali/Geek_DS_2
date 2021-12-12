package com.geeks.ds.java8;

import java.util.Arrays;
import java.util.Comparator;

public enum Element {
    HELIUM("He","Gas"),
    MAGNESIUM("Mg","Solid");
    private String chemecialSYmbol;
    private String nature;

    Element(String chemecialSYmbol, String nature) {
        this.chemecialSYmbol = chemecialSYmbol;
        this.nature = nature;
    }

    public String chemicalSymbol(){
        return chemecialSYmbol;
    }

    public String nature(){
        return nature;
    }

    public static void main(String[] args) {
        //System.out.printf("%s,%s,%s",Element.HELIUM,Element.HELIUM.chemecialSYmbol());;
        //System.out.printf("%s,%s,%s",Element[1],Element[1].);
        //System.out.printf("%s,%s,%s",Element[0],);
        System.out.printf("%s,%s,%s",Element.HELIUM.toString(),Element.HELIUM.chemecialSYmbol,Element.HELIUM.nature);
       // System.out.println(Element.HELIUM);




    }



}

class A1 {
  public int a ;
}
class B1 extends A1 {

    public int a;
}
class C1 extends  B1{


}

class D1{
    static A1 a = new A1();
    static B1 b = new B1();
   static  C1 c = new C1();
    public static void main(String[] args) {
        System.out.println(b instanceof B1);
        System.out.println((b instanceof B1) && (!(b instanceof A1)));
        System.out.println(b instanceof B1 && (!(b instanceof C1)));
        //System.out.println(b instanceof B1);
    }
}

class BitPuzzle {

    public static void main(String[] args) {
        int mask = 0x000F;
        int value = 0x2222;
        System.out.println(value & mask);
    }
}

class Compress {
    public static void main(String[] args) {
        String[] cities = {"Banglore","Pune", "San Fransicso","New Work City"};
        MySort ms  = new MySort();
        Arrays.sort(cities,ms);
        System.out.println(Arrays.binarySearch(cities,"New York City"));

    }
    static class MySort implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            return o1.toString().compareTo(o2.toString());
        }
    }
}


class SSBool {
    public static void main(String[] args) {
        boolean b1 =true;
        boolean b2 = false;
        boolean b3 = true;
        if(b1 =true){
            System.out.println("hello");
        }

        if(b1 & b2 | b2 & b3 | b2){
            System.out.println("Ok");
        }
            if(b1 & b2 | b2 & b3 | b2 |b1){
                System.out.println("donkeyt");
        }
    }
}


class TestFirstApp {
   static void doIt(int x, int y, int m){
       if(x ==5){
           m =y;
       }else{
           m =x;
       }
   }

    public static void main(String[] args) {
        int i =6, j =4, k =9;
        TestFirstApp.doIt(i,j,k);
        System.out.println(k);
    }

}

class MyThread extends Thread {
    MyThread(){
        System.out.println(" MyThread");
    }

    public void run(){
        System.out.println(" bar");
    }
    public void run(String s){
        System.out.println(" baz");
    }
}

class TestThreads {
    public static void main(String[] args) {
        Thread t = new MyThread() {
            public void run(){
                System.out.println(" foo");
            }
        };
        t.start();
    }
}


