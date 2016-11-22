package com.asd.finalproject.framework.factory;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.service.AccountService;

/**
 * Created by gedionz on 11/22/16.
 */
public interface AccountFactory {
    AccountDAO createAccountDAO(AccountDAOType accountDAOType);
    AccountService createAccountService();
}
