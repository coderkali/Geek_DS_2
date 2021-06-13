package com.geeks.ds;

public class PatternMatch {

    static int binaryPatternMatching(String pattern, String s) {
        char[] ch = s.toCharArray();

        for(char c : ch){
            s= s.replace(c, replaceVobal(c));
        }

        int matches =0;
        int stop =s.length()- pattern.length();
        for(int i =0; i<=stop; i++){
            String sub = s.substring(i,pattern.length()+i);
            if(sub.equalsIgnoreCase(pattern)){
                matches++;
            }
        }
        return matches;
    }

    public static char replaceVobal(Character c){
        if(c.equals('a') || c.equals('e') || c.equals('i') || c.equals('o')|| c.equals('u')|| c.equals('y')){
            return '0';
        }else{
            return '1';
        }
    }


    public static void main(String[] args) {
        System.out.println(binaryPatternMatching("010","amazing"));
    }

}
