package com.asd.finalproject.creditcard;

import com.asd.finalproject.framework.specialstuff.InterestStrategy;

/**
 * Created by gedionz on 11/21/16.
 */
public class BronzeInterestRate implements InterestStrategy {
    @Override
    public Double getInterest(Double balance) {
    	double interest = 0;
		interest = balance * 0.1;
		return interest;
    }
}
