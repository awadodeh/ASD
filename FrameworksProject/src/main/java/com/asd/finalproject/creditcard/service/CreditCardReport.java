package com.asd.finalproject.creditcard.service;

import com.asd.finalproject.creditcard.entity.CreditCardAccount;
import com.asd.finalproject.framework.service.Report;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/23/16.
 */
public class CreditCardReport implements Report {

    private LocalDate from;
    private LocalDate to;
    private CreditCardAccount account;

    public CreditCardReport(CreditCardAccount account, LocalDate from, LocalDate to) {
        this.account = account;
        this.from = from;
        this.to = to;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();

        report.append("Credit card report of " + account.getAccountNumber() + " for " + to.getMonth().toString());

        return report.toString();
    }
}
