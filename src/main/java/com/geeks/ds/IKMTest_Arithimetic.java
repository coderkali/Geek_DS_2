package com.geeks.ds;

public class IKMTest_Arithimetic {

    public static void main(String[] args) {
        Double d =1.0;
        if(d instanceof  Number){
            d = d++;
        }
        boolean conditional1 = (d==2) ? true : false;
        if(conditional1){
            System.out.println("Perform action1");
        }
        double e = 1.0;
        if((Double) e instanceof  Double | d++ == e++){
            d +=d;
        }
        boolean condition2 =  (d>2) ? true: false;
        if(condition2){
            System.out.println("Perform action2");
        }
        boolean condition3 = conditional1 ^ condition2;
        if(condition3){
            System.out.println("Perform action3");
        }

    }
}
