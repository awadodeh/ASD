package com.asd.finalproject.banking.service;

import com.asd.finalproject.framework.service.InterestStrategy;

public class SavingInterestStrategy implements InterestStrategy {

	private final Double rate = 0.05;
	@Override
	public Double getInterest(Double balance) {
		return balance * rate;
	}

}

