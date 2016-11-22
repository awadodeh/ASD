package com.asd.finalproject.framework.entity;


import com.asd.finalproject.framework.specialstuff.InsufficientBalanceException;
import com.asd.finalproject.framework.specialstuff.InterestStrategy;
import com.asd.finalproject.framework.specialstuff.Observable;

/**
 * Created by gedionz on 11/21/16.
 */
public abstract class Account extends Observable{
    private String accountNumber;
    private InterestStrategy interestStrategy;
    private Customer customer;
    protected Double balance = 0.0;

    public Account(String accountNumber, Customer customer) {
        this.customer = customer;
        this.accountNumber = accountNumber;
    }

    protected void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public void addInterest() {
        deposit(interestStrategy.getInterest(balance));
    }
    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount) throws InsufficientBalanceException;

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double getBalance() {
        return balance;
    }
}
