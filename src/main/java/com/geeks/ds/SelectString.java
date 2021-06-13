package com.geeks.ds;

import java.util.Arrays;
import java.util.List;

public interface SelectString {

    boolean select(MyString s);
}

class MyString {
    String string;

    @Override
    public String toString(){
        return string;
    }

    MyString(String s){
        this.string =s;
    }
}

class MyStringList {
    static List<MyString> list = Arrays.asList(new MyString("CAR"),new MyString("TRUCK"));
    public static void print(SelectString selectString){
        for(MyString s : list){
            if(selectString.select(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        print(s -> s.string.charAt(0) == 'C');
    }
;}
