package com.asd.finalproject;

import com.asd.finalproject.framework.factory.AccountDAOType;
import com.asd.finalproject.framework.factory.AccountFactoryImpl;
import com.asd.finalproject.framework.service.AccountService;

public class Test {
    public static void main(String[] args) {
        AccountService accountService = new AccountFactoryImpl().createAccountService(AccountDAOType.IN_MEMORY);

        System.out.println("test");
    }
}
