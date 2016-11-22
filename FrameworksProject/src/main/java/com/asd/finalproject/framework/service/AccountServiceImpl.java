package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.specialstuff.InsufficientBalanceException;

import java.util.Map;

/**
 * Created by gedionz on 11/21/16.
 */
public class AccountServiceImpl implements AccountService{
    private AccountDAO accountDAO;
    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
    public void createAccount(Account account) {

    }

    public Account getAccount(String accountNumber) {
        return null;
    }

    public Map<String, Account> getAllAccounts() {
        return null;
    }

    public void deposit(String accountNumber, Double amount) {

    }

    public void withdraw(String accountNumber, Double amount) {
        Account account = getAccount(accountNumber);
        if(account != null) {
            try {
                account.withdraw(amount);
                accountDAO.saveAccount(account);
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }

            account.notifyObservers(amount);
        }
    }

    public void addInterest(String accountNumber, Double amount) {

    }
}
