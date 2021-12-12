package com.geeks.ds;

public class OverirdeCheck {

    protected int getLocalCode(String value,boolean isValidated){
        return 0;
    }
}


class OverirdenCheck extends OverirdeCheck {

    @Override
    public int getLocalCode(String value,boolean isValidated){
        return 0;
    }


}