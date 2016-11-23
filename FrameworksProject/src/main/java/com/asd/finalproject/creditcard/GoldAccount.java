package com.asd.finalproject.creditcard;


import com.asd.finalproject.framework.entity.Customer;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/21/16.
 */
public class GoldAccount extends CreditCardAccount{
    public GoldAccount(String accountNumber, Customer customer) {
        super(accountNumber,customer, LocalDate.now());
        setInterestStrategy(new GoldInterestRate());
    }

}
