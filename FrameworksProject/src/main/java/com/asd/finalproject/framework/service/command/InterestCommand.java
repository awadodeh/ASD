package com.asd.finalproject.framework.service.command;

import com.asd.finalproject.framework.service.AccountService;

/**
 * Created by gedionz on 11/23/16.
 */
public class InterestCommand implements Command {

    private AccountService accountService;

    public InterestCommand(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void execute() {
        accountService.addInterest();
    }
}
