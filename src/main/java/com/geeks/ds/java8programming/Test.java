package com.geeks.ds.java8programming;

import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {
        Integer x = 3;
        Integer y = null;
        try{
            System.out.println(Integer.compareUnsigned(x,3)==0 ||
                    Integer.compareUnsigned(y,0) ==0);

        }catch(Exception ex){
            System.out.println(ex.getClass().toString());
        }
        try{
            System.out.println(y.compareTo(null) == 0 || true);
        }catch (Exception e){
            System.out.println(e.getClass().toString());
        }




    }
}
