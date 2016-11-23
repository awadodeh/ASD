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

//    private volatile AccountDAO mockDAO;
//    private volatile AccountDAO inMemoryDAO;
    private volatile static AccountFactory accountFactory;

    private volatile AccountDAO accountDAO;
    private volatile AccountService accountService;

    private  AccountFactoryImpl() {}
/*
    public static AccountFactory getAccountFactoryInstance() {
        if(accountFactory == null) {
            synchronized (AccountFactoryImpl.class) {
                if(accountFactory == null) {
                    accountFactory = new AccountFactoryImpl();
                }
            }
        }
        return  accountFactory;
    }
    */

    @Override
    public AccountService createAccountService(AccountDAOType accountDAOType) {
        if(accountService == null) {
            synchronized (AccountFactoryImpl.class) {
                if(accountService == null) {
//                    AccountDAO accountDAO = createAccountDAO(accountDAOType);
//                    AccountService accountServiceImpl = new AccountServiceImpl(accountDAO);
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

    private AccountDAO createAccountDAO(AccountDAOType accountDAOType) {
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
    private AccountDAO createInMemoryDAO() {
        if(accountDAO == null) {
            synchronized (AccountFactoryImpl.class) {
                if(accountDAO == null) {
                    accountDAO = new AccountDAOImpl();
                }
            }
        }
        return  accountDAO;
    }
    private AccountDAO createMockDAO() {
        if(accountDAO == null) {
            synchronized (AccountFactoryImpl.class) {
                if(accountDAO == null) {
                    accountDAO = new AccountDAOMock();
                }
            }
        }
        return accountDAO;
    }
}
