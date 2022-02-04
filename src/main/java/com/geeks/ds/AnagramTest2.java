package com.geeks.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramTest2 {

    public static void main(String[] args) {
        List<List<String>> groups = groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});
        for (List<String> group : groups) {
            for (String word : group)
                System.out.print(word + " ");
            System.out.println();

        }

    }
    public static List<List<String>> groupAnagrams(String[] strs)
    {
        HashMap<String,List<String>> h=new HashMap<>();

        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String sortedtemp = String.valueOf(temp);
            if (!h.containsKey(sortedtemp)) {
                h.put(sortedtemp, new ArrayList<>());
            }
            h.get(sortedtemp).add(str);
        }
        return new ArrayList(h.values());
    }
}
