package com.asd.finalproject.creditcard.entity;

import com.asd.finalproject.creditcard.exception.LimitExceededException;
import com.asd.finalproject.creditcard.service.CreditCardReport;
import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Customer;
import com.asd.finalproject.framework.service.Report;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/22/16.
 */
public abstract class CreditCardAccount extends Account {

    private LocalDate expirationDate;
    private Double limit = -1500.0;

    public CreditCardAccount(String accountNumber, Customer customer, LocalDate expirationDate) {
        super(accountNumber, customer);
        this.expirationDate = expirationDate;
    }

    @Override
    public void deposit(Double amount) {
    	//TODO
    }

    @Override
    public void withdraw(Double amount) throws LimitExceededException{
        if((balance - amount) >= limit) {
            balance -= amount;
        }else {
            throw new LimitExceededException("Credit account exceeded the limit");
        }
    }

    @Override
    public void addInterest() throws LimitExceededException {
        withdraw(getInterestStrategy().getInterest(balance));
    }

    @Override
    public Report report(LocalDate from, LocalDate to) {
        return new CreditCardReport(this, from, to);
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }
}

