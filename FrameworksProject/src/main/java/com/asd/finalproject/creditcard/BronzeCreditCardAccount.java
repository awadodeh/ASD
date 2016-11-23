package com.asd.finalproject.creditcard;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Customer;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/22/16.
 */
public class BronzeCreditCardAccount extends CreditCardAccount {


    public BronzeCreditCardAccount(String accountNumber, Customer customer, LocalDate expirationDate) {
		super(accountNumber, customer, expirationDate);
        setInterestStrategy(new BronzeInterestRate());
	}
}
