package com.geeks.ds.hackerrank;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        Stack st  = new Stack();
        st.push(1);
        st.push(1.1);
        st.push('Z');
        st.push("Hello");

        for (Object e: st) {
            System.out.println(e);
        }
    }
}
