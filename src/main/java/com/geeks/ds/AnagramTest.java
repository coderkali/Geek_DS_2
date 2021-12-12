package com.geeks.ds;

import java.util.ArrayList;
import java.util.Collections;

public class AnagramTest {
    public static void main(String[] args) {
        String s1 = "aa bb";
        String s2 = "ab ab";
        System.out.println(check(s1, s2));
    }

    public static boolean check(String s1, String s2) {
        // Remove white space and change to lower case.
        s1 = s1.replace(" ","").toLowerCase();
        s2 = s2.replace(" ","").toLowerCase();

        // If they are equal, return true. If they are not the same length,
        // return false.
        if (s1.equals(s2)) {
            return true;
        } else if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to ArrayList for sorting.
        ArrayList<Character> sl1 = new ArrayList<Character>();
        ArrayList<Character> sl2 = new ArrayList<Character>();

        for (char ch1 : s1.toCharArray()) {
            sl1.add(ch1);
        }

        for (char ch2 : s2.toCharArray()) {
            sl2.add(ch2);
        }

        // Sort both ArrayLists
        Collections.sort(sl1);
        Collections.sort(sl2);

        // If they are equal return true, else return false.
        if (sl1.equals(sl2)) {
            return true;
        } else {
            return false;
        }
    }
}
