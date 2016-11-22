package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.specialstuff.Command;
import com.asd.finalproject.framework.specialstuff.WithdrawCommand;

import java.util.Map;

/**
 * Created by gedionz on 11/21/16.
 */
public class AccountServiceProxy implements AccountService {

    private AccountService accountService;
    private Command command;

    public AccountServiceProxy(AccountService accountService) {
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
        System.out.println("Calling withdraw on account " + accountNumber);
        command = new WithdrawCommand(accountService, accountNumber, amount);
        command.execute();
    }

    @Override
    public void addInterest(String accountNumber, Double amount) {

    }
}
