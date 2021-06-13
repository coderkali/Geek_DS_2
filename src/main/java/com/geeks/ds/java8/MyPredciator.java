package com.geeks.ds.java8;

import java.util.function.Predicate;

public class MyPredciator<T> implements Predicate<T> {

    Predicate<T> local;
    MyPredciator(Predicate<T> t){
        local =t;
    }

    @Override
    public boolean test(T t) {
        return local.test(t);
    }


}


class Predicator1 {

    static boolean testit(Object s, Predicate<Object> p){
        return p.test(s);
    }

    public static void main(String[] args) {
        final String s1 = "HI";
        final Integer i1= 3;
        final int x= 1;
        MyPredciator<Object>[] p = new MyPredciator[4];
        p[0] = new MyPredciator<>(e -> e.equals(s1));

        p[1] = new MyPredciator<>(e -> {
            if(x==1){
                return e.equals(s1);
            }
            return !e.equals(s1);
        });

        p[2] = new MyPredciator<>(e -> {
            if(x==1){
                return e.equals(i1);
            }
            return !e.equals(s1);
        });

        p[3] = new MyPredciator<>((Object e) -> {
            if(x!=1){
                return e.equals(i1);
            }
            return !e.equals(s1);
        });

        for(MyPredciator<Object> pp:p){
            System.out.println(testit(s1,pp));
        }
    }
}
