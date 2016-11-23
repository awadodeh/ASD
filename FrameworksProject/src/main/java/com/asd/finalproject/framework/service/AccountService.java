package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.entity.Account;

import java.time.LocalDate;
import java.util.Map;

/**
 * Created by gedionz on 11/21/16.
 */
public interface AccountService {
    void createAccount(Account account);
    Account getAccount(String accountNumber);
    Map<String, Account> getAllAccounts();
    void deposit(String accountNumber, Double amount);
    void withdraw(String accountNumber, Double amount);
    void addInterest();
    String generateReport(String accountNumber, LocalDate from, LocalDate to);
}
