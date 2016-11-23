package com.asd.finalproject.framework.entity;


import com.asd.finalproject.framework.specialstuff.AccountException;
import com.asd.finalproject.framework.specialstuff.InterestStrategy;
import com.asd.finalproject.framework.specialstuff.Observable;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by gedionz on 11/21/16.
 */
public abstract class Account extends Observable{
    private String accountNumber;
    private InterestStrategy interestStrategy;
    private Customer customer;
    protected Double balance = 0.0;

    private List<Transaction> transactions;

    public Account(String accountNumber, Customer customer) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        customer.addAccount(this);
        transactions = new ArrayList<>();
    }


    protected void setInterestStrategy(InterestStrategy interestStrategy) {
        this.interestStrategy = interestStrategy;
    }

    public void addInterest() {
        deposit(interestStrategy.getInterest(balance));
    }

    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount) throws AccountException;

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Double getBalance() {
        return balance;
    }

    protected void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return accountNumber.equals(account.accountNumber);

    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}
