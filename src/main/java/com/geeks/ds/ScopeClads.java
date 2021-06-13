package com.geeks.ds;

public class ScopeClads {

    int i ;

    void display(){
        System.out.println(i);
    }
}

class subClass extends  ScopeClads {

     int j;
     void display(){
         System.out.println(j);
     }
}

class MainMethod {
    public static void main(String[] args) {
        subClass obj = new subClass();
        obj.i=1;
        obj.j=2;
        obj.display();
    }
}
