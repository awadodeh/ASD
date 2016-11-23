package com.asd.finalproject.banking.entity;

import com.asd.finalproject.banking.exception.InsufficientBalanceException;
import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Customer;
import com.asd.finalproject.framework.entity.Transaction;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/22/16.
 */
public abstract class BankAccount extends Account{
    public BankAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }

    @Override
    public void deposit(Double amount) {
        balance += amount;
        String description = "deposited";
        Transaction transaction = new Transaction(amount, LocalDate.now(), description);
        addTransaction(transaction);
    }

    @Override
    public void withdraw(Double amount) throws InsufficientBalanceException {
        if((balance - amount) < 0 ) {
            throw new InsufficientBalanceException();
        }else{
			balance -= amount;
			String description = "withdrawn";
			Transaction transaction = new Transaction(amount, LocalDate.now(), description);
			addTransaction(transaction);
        }
       
    }
}
