package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.service.exception.AccountException;

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
        accountDAO.saveAccount(account);
    }

    public Account getAccount(String accountNumber) {
        return accountDAO.loadAccount(accountNumber);
    }

    public Map<String, Account> getAllAccounts() {
        return null;
    }

    public void deposit(String accountNumber, Double amount) {
        Account account = getAccount(accountNumber);
        if(account != null) {
            account.deposit(amount);
            accountDAO.updateAccount(account);

            account.notifyObservers(amount);
        }
    }

    public void withdraw(String accountNumber, Double amount) {
        Account account = getAccount(accountNumber);
        if(account != null) {
            try {
                account.withdraw(amount);
                accountDAO.updateAccount(account);
            } catch (AccountException e) {
                amount = null;
                e.printStackTrace();
            }

            account.notifyObservers(amount);
        }
    }

    @Override
    public void addInterest() {
        Map<String, Account> allAccounts = getAllAccounts();
        allAccounts.forEach((accountNumber, account) -> account.addInterest());
    }
}
