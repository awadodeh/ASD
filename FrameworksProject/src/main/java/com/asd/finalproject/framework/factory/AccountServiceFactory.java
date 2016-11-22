package com.asd.finalproject.framework.factory;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.service.AccountService;
import com.asd.finalproject.framework.service.AccountServiceImpl;
import com.asd.finalproject.framework.service.AccountServiceProxy;

/**
 * Created by gedionz on 11/22/16.
 */
public class AccountServiceFactory {
    private static volatile AccountService accountService;

    public static AccountService createAccountService() {
        if(accountService == null) {
            synchronized(AccountServiceFactory.class) {
                if(accountService == null) {
                    AccountDAOFactory accountDAOFactory = new AccountDAOFactoryImpl();
                    AccountDAO accountDAO= accountDAOFactory.createAccountDAO(AccountDAOType.IN_MEMORY);
                    accountService = new AccountServiceProxy(new AccountServiceImpl(accountDAO));
                }
            }
        }

        return accountService;
    }
}
