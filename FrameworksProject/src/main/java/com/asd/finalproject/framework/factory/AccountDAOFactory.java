package com.asd.finalproject.framework.factory;

import com.asd.finalproject.framework.dataaccess.AccountDAO;

/**
 * Created by gedionz on 11/22/16.
 */
public interface AccountDAOFactory {
    AccountDAO createAccountDAO(AccountDAOType accountDAOType);
}
