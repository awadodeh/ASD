package com.asd.finalproject.creditcard;

import java.time.LocalDate;

import com.asd.finalproject.framework.entity.Customer;

/**
 * Created by gedionz on 11/22/16.
 */
public class GoldCreditCardAccount extends CreditCardAccount {


    public GoldCreditCardAccount(String accountNumber, Customer customer, LocalDate expirationDate) {
        super(accountNumber, customer,expirationDate);
        
        setInterestStrategy(new GoldInterestRate());
    }
}
