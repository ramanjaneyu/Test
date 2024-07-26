package com.test.core.java.solidprinciples.srp;

/*
This is the right way of segregating the transaction related operations from Bank Account operations
and thus not violating the SRP.
*/
public class TransactionOperationsService {

    public long deposit(long amount, String accountNo){
        //logic for amount deposit
        return 0;
    }
    public long withDraw(long amount, String accountNo){
        //logic for withdraw amount
        return 0;
    }
}
