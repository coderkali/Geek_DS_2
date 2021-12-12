package com.geeks.ds.hackerearth;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HackerEarth2 {

    static String val1;

    public static void main(String[] args) {
        List l = new ArrayList();
        l.clear();
        Hashtable t = new Hashtable();

        HackerEarth2 v2= new HackerEarth2();
        val1 = v2.getString("Program");
        System.out.println("" + val1);
    }

    public static String getString(String st){
        StringBuffer sb =new StringBuffer(st.length());
        for(int i= st.length()-1; i>0; i--){
            sb.append(st.charAt(i));
        }

        return sb.toString();
    }
}
