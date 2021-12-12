package com.geeks.ds;

import java.util.ArrayList;

public class CollectionTest {

    public static void addtoString(ArrayList<?> collection, Object element){
        //collection.add(element);
    }


    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        addtoString(collection,"One");
        System.out.printf("Size Of COllection is %s",collection.size());
    }
}
