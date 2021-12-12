package com.geeks.ds.java8;

import java.util.Formatter;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class A {
     void m1(){

    }
   static String message;
    public static void main(String[] args) {

        Supplier<String> i = () -> "car";
        Consumer<String> s = x -> System.out.print(x.toLowerCase());
        Consumer<String> d = x -> System.out.print(x.toUpperCase());
        s.andThen(d).accept(i.get());

        System.out.println();




        String strA = "A";
        String strB = "B";
        String strNull = null;
        StringBuffer sb = new StringBuffer("C");

        Formatter fm = new Formatter(sb);

        fm.format("%s%s",strA,strB);
        System.out.println("Line 1: "+fm);


        fm.format("%-2s",strB);
        System.out.println("Line 2: "+fm);


        fm.format("%b",strNull);
        System.out.println("Line 3: "+fm);






//        boolean b= false;
//        int n =5;
//        System.out.println(b || n==5);
//        System.out.println(b = true && n==5);
//        System.out.println(b);
//
//        System.out.println(calc(5));

        try{
            String message = getMessage();
            System.out.println(message);
        }catch(Exception e){
            message +="E";
            System.out.println(message);
        }finally{
            System.out.println(message);
        }

    }

    public static int calc(int x){
         if(x==0){
             return 1;
         }
         else{
             return x * calc(x-1);
         }
    }

    public static String getMessage() throws Exception{
         String message ="A";
         try{
             throw new Exception();
         }catch(Exception e){
             try{
                 try{
                     throw new Exception();
                 }catch(Exception ex){
                     message += "B";
                 }
                 throw new Exception();
             }catch(Exception e1){
                 message +="C";
             }
             finally{
                 message +="D";
             }
         }finally {
             message +="E";
         }
         return message;

    }

}

class B {

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }

}
