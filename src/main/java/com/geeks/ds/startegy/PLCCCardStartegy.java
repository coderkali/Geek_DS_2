package com.geeks.ds.startegy;

public class PLCCCardStartegy implements StartegyTypesI {

    @Override
    public String getTransaction(String type) {
        return "PLCCCardBlockTxn";
    }
}
