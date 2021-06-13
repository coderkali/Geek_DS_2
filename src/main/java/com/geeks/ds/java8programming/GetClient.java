package com.geeks.ds.java8programming;

import java.util.List;

public class GetClient {

    public static void main(String[] args) {
        
        List<Number> numbers = null;
        getClient(numbers);
    }

    public static int getClient(List<? extends Number> parms){
      return 0;
    }

//    public static int getClient(List<Number> parms){
//        return 0;
//    }
}
