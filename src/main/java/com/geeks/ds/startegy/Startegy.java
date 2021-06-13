package com.geeks.ds.startegy;

public class Startegy {

    StartegyTypesI startegyTypesI;

    public Startegy(StartegyTypesI startegyTypesI) {
        this.startegyTypesI = startegyTypesI;
    }


    public String getTransaction(String type){
        return startegyTypesI.getTransaction(type);
    }



}
