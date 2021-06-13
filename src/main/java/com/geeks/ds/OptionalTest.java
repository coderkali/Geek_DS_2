package com.geeks.ds;

import java.util.Optional;

public class OptionalTest {
    public static int main(String[] args) {
        Optional opt = Optional.of("Got");
        String[] str =new String[10];

        Optional strOpt = Optional.ofNullable(str[9]);
        System.out.println(strOpt.isPresent());
        System.out.println(opt.isPresent());
        try{

        }catch (Exception e){

        }finally {
            return 1;
        }
    }
}
