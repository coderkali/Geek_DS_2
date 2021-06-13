package com.geeks.ds;

public class InheritancTest2 {

    protected  Number getLocalCode(String value,boolean isValidated){
        return 1;
    }
}

class TestInhertiance  extends  InheritancTest2{

    // compile error
//    @Override
//    protected  Number getLocalCode(int value, boolean isValidated){
//        return 1;
//    }

    // Compile Successfully
//    @Override
//    protected  Integer getLocalCode(String value, boolean isValidated){
//        return 1;
//    }

     // compile success
//    @Override
//    protected  Number getLocalCode(String value, boolean isValidated){
//        return 1;
//    }

    //compile success
//    @Override
//    public  Number getLocalCode(String value, boolean isValidated){
//        return 1;
//    }

    // compile error
//    @Override
//    private  Integer getLocalCode(String value, boolean isValidated){
//        return 1;
//    }




}
