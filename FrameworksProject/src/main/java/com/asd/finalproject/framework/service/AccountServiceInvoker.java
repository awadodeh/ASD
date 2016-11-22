package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.specialstuff.Command;
import com.asd.finalproject.framework.specialstuff.WithdrawCommand;

import java.util.Map;

/**
 * Created by gedionz on 11/21/16.
 */
public class AccountServiceInvoker implements AccountService {

    private AccountService accountService;

    public AccountServiceInvoker(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void createAccount(Account account) {

    }

    @Override
    public Account getAccount(String accountNumber) {
        return null;
    }

    @Override
    public Map<String, Account> getAllAccounts() {
        return null;
    }

    @Override
    public void deposit(String accountNumber, Double amount) {

    }

    @Override
    public void withdraw(String accountNumber, Double amount) {
        Command withdrawCommand = new WithdrawCommand(accountService, accountNumber, amount);

        withdrawCommand.execute();
    }

    @Override
    public void addInterest(String accountNumber, Double amount) {

    }
}
