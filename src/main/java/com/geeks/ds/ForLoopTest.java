package com.geeks.ds;

public class ForLoopTest {

    public static void main(String[] args) {
        int i=10, j=12;
        for(;;){
            if(i++ <j--)
                continue;
            else
                break;

//            System.out.println(i+" "+j);
        }
    }
}
