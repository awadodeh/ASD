package com.asd.finalproject.banking;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Customer;

/**
 * Created by gedionz on 11/22/16.
 */
public abstract class BankAccount extends Account{
    public BankAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }
}
