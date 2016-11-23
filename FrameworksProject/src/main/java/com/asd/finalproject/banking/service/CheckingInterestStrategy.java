package com.asd.finalproject.banking.service;

import com.asd.finalproject.framework.service.InterestStrategy;

public class CheckingInterestStrategy implements InterestStrategy {

	private final Double rate = 0.0;
	@Override
	public Double getInterest(Double balance) {
		return rate;
	}

}
