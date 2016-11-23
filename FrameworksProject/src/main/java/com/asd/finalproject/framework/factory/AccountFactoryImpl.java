package com.asd.finalproject.framework.factory;

import com.asd.finalproject.framework.dataaccess.AccountDAO;
import com.asd.finalproject.framework.dataaccess.AccountDAOImpl;
import com.asd.finalproject.framework.dataaccess.AccountDAOMock;
import com.asd.finalproject.framework.service.AccountService;
import com.asd.finalproject.framework.service.AccountServiceImpl;
import com.asd.finalproject.framework.service.AccountServiceProxy;

/**
 * Created by gedionz on 11/22/16.
 */
public class AccountFactoryImpl  implements AccountFactory{

    private volatile AccountDAO mockDAO;
    private volatile AccountDAO inMemoryDAO;
    private volatile AccountService accountService;

    @Override
    public AccountDAO createAccountDAO(AccountDAOType accountDAOType) {
        AccountDAO accountDAO = null;
        switch (accountDAOType) {
            case IN_MEMORY:
                accountDAO =  createInMemoryDAO();
                break;
            case MOCK:
                accountDAO = createMockDAO();
            default:
        }
        return accountDAO;
    }


    @Override
    public AccountService createAccountService(AccountDAOType accountDAOType) {
        if(accountService == null) {
            synchronized (AccountFactoryImpl.class) {
                if(accountService == null) {
                    accountService = new AccountServiceProxy(
                            new AccountServiceImpl(
                                    createAccountDAO(accountDAOType)
                            )
                    );
                }
            }
        }
        return accountService;
    }

    private AccountDAO createInMemoryDAO() {
        if(inMemoryDAO == null) {
            synchronized (AccountFactoryImpl.class) {
                if(inMemoryDAO == null) {
                    inMemoryDAO = new AccountDAOImpl();
                }
            }
        }
        return  inMemoryDAO;
    }

    private AccountDAO createMockDAO() {
        if(mockDAO == null) {
            synchronized (AccountFactoryImpl.class) {
                if(mockDAO == null) {
                    mockDAO = new AccountDAOMock();
                }
            }
        }
        return mockDAO;
    }
}
