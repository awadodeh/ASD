package com.asd.finalproject.banking.service;

import com.asd.finalproject.banking.entity.BankAccount;
import com.asd.finalproject.framework.service.Report;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/23/16.
 */
public class BankReport implements Report {

    private LocalDate from;
    private LocalDate to;
    private BankAccount account;

    public BankReport(BankAccount account, LocalDate from, LocalDate to) {
        this.from = from;
        this.to = to;
        this.account = account;
    }

    @Override
    public String generateReport() {
        StringBuilder report = new StringBuilder();

        report.append("Bank report of " + account.getAccountNumber() + " for " + to.getMonth().toString());

        return report.toString();
    }
}
