package com.geeks.ds;

public class CamelCaseSeperaion {

    public static void main(String[] args)
    {
        boolean status =false;
        String[] words ={"camel","test","Value"};
        String[] camelCase= "camelValue".split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");
        int length = camelCase.length;
        int count =0;
        for (String w : camelCase) {
            for(String word : words){
                if(word.equalsIgnoreCase(w)){
                    status = true;
                    count++;
                }else{
                    status = false;
                }
            }
        }

        System.out.println(status);
        System.out.println(count);
    }
}
