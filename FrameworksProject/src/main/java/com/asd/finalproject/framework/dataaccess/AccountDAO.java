package com.asd.finalproject.framework.dataaccess;

import com.asd.finalproject.framework.entity.Account;

import java.util.Map;

/**
 * Created by gedionz on 11/21/16.
 */

public interface AccountDAO {
    void saveAccount(Account account);
    void updateAccount(Account account);
    Account loadAccount(String accountNumber);
    Map<String, Account> getAllAccounts();
}
