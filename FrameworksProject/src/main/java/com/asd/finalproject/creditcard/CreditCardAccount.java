package com.asd.finalproject.creditcard;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Customer;
import com.asd.finalproject.framework.specialstuff.InsufficientBalanceException;

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

    }

    @Override
    public void withdraw(Double amount) throws InsufficientBalanceException{
        if((balance - amount) >= limit) {
            balance -= amount;
        }else {
            throw new InsufficientBalanceException();
        }
    }
}
