package com.test.core.java.solidprinciples.srp;
/*
This class demonstrates about the wrong way or violating the "Single Responsibility Principle" in SOLID principles.
 */
public class BankAccountOperationsService {
    public void addAccount(Account account){
        //logic for adding a new account
    }
    public void updateAccount(Account account){
        //logic for updating adding a new account
    }
    public Account getAccount(Account account){
        //logic for getting an account details
        return null;
    }
    /*This method should not be part of BankAccountOperationsService class
    Reason is account operations are responsible for doing operations for
    account like add account, update account, get account. However deposit,
    withDraw are something related to Transactions which should be part of
    TransactionService.
    Adding this method violates the SRP. In order to overcome this problem
    we need to create a new class for deposit, withDraw that will take care
    of Transaction operations.
     */
    public long deposit(long amount, String accountNo){
        //logic for amount deposit
        return 0;
    }
    public long withDraw(long amount, String accountNo){
        //logic for withdraw amount
        return 0;
    }
    /*
    This class also should not be part of Account service and should be moved to a new class
    that will take care of Loans.
     */
    public void getLoanInterestDetails(String loanType){
        if("home".equals(loanType)){
            //write logic for homeloan
        }
        if("car".equals(loanType)){
            //write logic for car loan
        }
        if("personal".equals(loanType)){
            //write logic for personal loan
        }
    }
    /*
    This method should not be part of BankService and should be part of a new class say NotificationService
     */
    public void sendOTP(String medium){
        if("email".equals(medium)){
            //write email related logic to send mail using java mail api
        }
        if("mobile".equals(medium)){
            //write mobile related logic
        }
    }
}
class Account{

}