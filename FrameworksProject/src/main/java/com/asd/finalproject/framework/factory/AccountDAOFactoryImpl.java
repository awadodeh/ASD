package com.asd.finalproject.framework.factory;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.dataaccess.AccountDAOImpl;

/**
 * Created by gedionz on 11/22/16.
 */
public class AccountDAOFactoryImpl implements AccountDAOFactory {
    @Override
    public AccountDAO createAccountDAO(AccountDAOType accountDAOType) {
        AccountDAO accountDAO = null;
        switch (accountDAOType) {
            case IN_MEMORY:
                accountDAO =  new AccountDAOImpl();
                break;
            case MOCK:
            default:
        }
        return accountDAO;

    }
}
