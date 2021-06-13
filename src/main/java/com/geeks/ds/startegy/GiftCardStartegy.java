package com.geeks.ds.startegy;

public class GiftCardStartegy implements StartegyTypesI {
    @Override
    public String getTransaction(String type) {
        return "GiftCardBlockTxn";
    }
}
