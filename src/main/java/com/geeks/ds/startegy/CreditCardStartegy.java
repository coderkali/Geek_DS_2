package com.geeks.ds.startegy;

public class CreditCardStartegy implements StartegyTypesI {

    @Override
    public String getTransaction(String type) {
        return "CreditCardBlockTxn";
    }
}
