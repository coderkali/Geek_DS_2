package com.geeks.ds;

public class Palindrome {

    public static void main(String[] args) {
        //System.out.println(isPalindrome(313L));
        System.out.println(isPalindrome2(313));
    }
    public static boolean isPalindrome(Long number){
        if(CountTheDigit.count(number) > 1){
            Long reverse =0L;
            Long temp = number ;

            while(temp !=0){
                Long reminder = temp%10L;
                reverse= reverse*10 + reminder;
                temp = temp/10;
            }
            return reverse.equals(number);
        }
        return true;
    }

    public static boolean isPalindrome2(int a){
        int reverseA =0;
        int temp = a;
        while(temp > 0){
            int lasDigit = temp %10;
            reverseA = reverseA*10 +lasDigit;
            temp /=10;
        }
        return reverseA == a;
    }
}
