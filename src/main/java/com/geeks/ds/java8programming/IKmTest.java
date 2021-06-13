package com.geeks.ds.java8programming;



import java.util.SortedSet;
import java.util.TreeSet;

public class IKmTest {

    public static void main(String[] args) {
        SortedSet<Element> s = new TreeSet<Element>();
        s.add(new Element(15));
        s.add(new Element(10));
        s.add(new Element(25));
        s.add(new Element(10));
        System.out.println(s.first()+ " " + s.size() );
    }
}

class Element implements  Comparable{
    int id;

    Element(int id) {
        this.id = id ;
    }

    public int compareTo(Object obj){
        Element e = (Element) obj;
        return this.id = id;
    }

    public String toString(){
        return ""+ this.id;
    }
}
