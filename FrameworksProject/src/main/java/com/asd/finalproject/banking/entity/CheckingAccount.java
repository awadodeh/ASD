package com.asd.finalproject.banking.entity;

import com.asd.finalproject.banking.service.CheckingInterestStrategy;
import com.asd.finalproject.framework.entity.Customer;

/**
 * Created by gedionz on 11/21/16.
 */
public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
        setInterestStrategy(new CheckingInterestStrategy());
    }
}
