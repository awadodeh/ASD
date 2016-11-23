package com.asd.finalproject.creditcard.service;

import com.asd.finalproject.framework.service.InterestStrategy;

/**
 * Created by gedionz on 11/21/16.
 */
public class SilverInterestRate implements InterestStrategy {
    @Override
    public Double getInterest(Double balance) {
    	double interest = 0;
		interest = balance * 0.08;
		return interest;
		
    }
}
