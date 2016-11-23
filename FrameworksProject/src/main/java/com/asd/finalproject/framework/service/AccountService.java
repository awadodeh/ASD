package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.entity.Account;

import java.time.LocalDate;
import java.util.List;
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
    List<String> generateReport(String[] accountNumbers, LocalDate from, LocalDate to);
}
