package com.geeks.ds.java8practise;

public class OverrideTest {

    protected Number getLocaleCode(String value,boolean isValidated){
        return null;
    }

    protected Number getLocaleCode1(String value,boolean isValidated){
        return null;
    }
}

class Test extends  OverrideTest {


    @Override
    public Number getLocaleCode(String value,boolean isValidated){
        return null;
    }


}
