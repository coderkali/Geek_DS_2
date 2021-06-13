package com.geeks.ds.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonSUbSTring {

//    public static void main(String[] args) {
//       List<String> a = new ArrayList<>();
//       a.add("hello");
//       a.add("hi");
//
//        List<String> b = new ArrayList<>();
//        b.add("world");
//        b.add("bye");
//
//        commonSubStringTest(a,b);
//
//    }
//
//    public static void commonSubStringTest(List<String> a, List<String> b){
//        for (int i =0; i<a.size() ; i++){
//            String aValue = a.get(i);
//            String bValue = b.get(i);
//
//            if(aValue.contains(bValue)){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//        }
//    }


    static int MAX_CHAR = 26;

    // function to return true if strings have
    // common substring and no if strings have
    // no common substring
    static boolean twoStrings(List<String> s1List, List<String> s2List)
    {
        // vector for storing character occurrences
        for (int k = 0; k < s1List.size(); k++) {
           String s1 = s1List.get(k);
           String s2 = s2List.get(k);


            boolean v[] = new boolean[MAX_CHAR];
            Arrays.fill(v, false);

            // increment vector index for every
            // character of str1
            for (int i = 0; i < s1.length(); i++)
                v[s1.charAt(i) - 'a'] = true;

            // checking common substring of str2 in str1
            for (int i = 0; i < s2.length(); i++)
                if (v[s2.charAt(i) - 'a']){
                    System.out.println("YES");
                    return true;
                }
            System.out.println("NO");
            return false;
        }
        return false;
    }

    // Driver code
    public static void main (String[] args)
    {
        String str1 = "hello";
        String str2 = "world";
        List<String> str1List = Arrays.asList(str1,"hi");
        List<String> str2List = Arrays.asList(str2,"bye");
        if (twoStrings(str1List, str2List))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
