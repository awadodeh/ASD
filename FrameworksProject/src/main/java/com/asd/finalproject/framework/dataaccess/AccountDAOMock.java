package com.asd.finalproject.framework.dataaccess;

import com.asd.finalproject.framework.entity.Account;

import java.util.Map;

/**
 * Created by gedionz on 11/22/16.
 */
public class AccountDAOMock implements AccountDAO {
    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public Account loadAccount(String accountNumber) {
        return null;
    }

    @Override
    public Map<String, Account> getAllAccounts() {
        return null;
    }
}
