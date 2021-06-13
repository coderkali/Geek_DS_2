package com.geeks.ds;

public class GFG {

    public static void main(String[] args) {
        GFG g = new GFG();
        System.out.println(g.countSubstrings("aaa"));
    }

    public int countSubstrings(String s) {
        if (s == null) return 0;

        int count = 0;

        for (int center = 0; center < s.length(); center++) {
            count += countPalindromes(s, center, center);
            count += countPalindromes(s, center, center + 1);
        }

        return count;
    }


    private int countPalindromes(String s, int left, int right) {
        if (left > right || right > s.length()) return 0;
        int count = 0;
        boolean isPalindromic = left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right);

        while (isPalindromic) {
            count++;
            left--;
            right++;

            isPalindromic = left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right);
        }

        return count;
    }
}