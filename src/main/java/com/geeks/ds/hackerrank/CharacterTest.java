package com.geeks.ds.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CharacterTest {

    public static void main(String[] args) {
        char[] char1 = {'1','2','3','A','B','C'};
        char[] char2 = {'X','G','M','2','9','3','C','N','R'};
        List<Character[]> list = new ArrayList<>();
       CompareAlphanumeric(char1,char2);
    }

    static void CompareAlphanumeric(char[] str1,
                                       char[] str2)
    {
        boolean status=false;
        for(int i =0; i< str1.length ; i++){
            for(int j= 0; j<str2.length; j++){
                if(str1[i] == str2[j]){
                    status=true;
                    System.out.print(str1[i]+" ");
                }
            }
        }
        if(!status){
            System.out.println("NULL");
        }



    }

}
