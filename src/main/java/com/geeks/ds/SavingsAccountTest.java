package com.geeks.ds;

import java.math.BigDecimal;

interface Account {
    BigDecimal balance = new BigDecimal(0.00);
}

public class SavingsAccountTest implements  Account{

    public SavingsAccountTest(BigDecimal intialValue){
        //balance = intialValue;
    }

}
