package com.geeks.ds.startegy;

import java.util.function.Function;

public class StartegyWithFunctional {

    Function<String,String> startegyTypesI;

    public StartegyWithFunctional(Function<String,String> startegyTypesI) {
        this.startegyTypesI = startegyTypesI;
    }


    public String getTransaction(String type){
        return startegyTypesI.apply(type);
    }
}
