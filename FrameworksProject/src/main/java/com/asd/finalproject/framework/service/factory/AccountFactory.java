package com.asd.finalproject.framework.service.factory;

import com.asd.finalproject.framework.service.AccountService;

/**
 * Created by gedionz on 11/22/16.
 */
public interface AccountFactory {
    //AccountDAO createAccountDAO(AccountDAOType accountDAOType);
    AccountService createAccountService(AccountDAOType accountDAOType);
}
