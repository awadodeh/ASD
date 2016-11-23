package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.service.exception.AccountException;

import java.time.LocalDate;
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
    	
    	System.out.println("AccountServiceImpl.createAccount() with accountNO. " + account.getAccountNumber() );
    	
        accountDAO.saveAccount(account);
    }

    public Account getAccount(String accountNumber) {
        return accountDAO.loadAccount(accountNumber);
    }

    public Map<String, Account> getAllAccounts() {
        return null;
    }

    public void deposit(String accountNumber, Double amount) {
    	
    	System.out.println("AccountServiceImpl.deposit() with account No: " + accountNumber );
        
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

    @Override
    public String generateReport(String accountNumber, LocalDate from, LocalDate to) {
        Account account = getAccount(accountNumber);
        if(account != null) {
            return account.report(from, to).generateReport();
        }

        return null;
    }
}
