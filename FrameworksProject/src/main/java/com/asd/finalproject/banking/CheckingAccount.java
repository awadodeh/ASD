package com.asd.finalproject.banking;

import com.asd.finalproject.framework.entity.Customer;
import com.asd.finalproject.framework.specialstuff.InsufficientBalanceException;

/**
 * Created by gedionz on 11/21/16.
 */
public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, Customer customer) {
        super(accountNumber, customer);
    }
}
