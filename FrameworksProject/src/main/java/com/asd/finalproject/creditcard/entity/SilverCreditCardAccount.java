package com.asd.finalproject.creditcard.entity;

import com.asd.finalproject.creditcard.service.SilverInterestRate;
import com.asd.finalproject.framework.entity.Customer;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/22/16.
 */
public class SilverCreditCardAccount extends CreditCardAccount {

	public SilverCreditCardAccount(String accountNumber, Customer customer, LocalDate expirationDate) {
		super(accountNumber, customer, expirationDate);
		
		setInterestStrategy(new SilverInterestRate());
	}

}
