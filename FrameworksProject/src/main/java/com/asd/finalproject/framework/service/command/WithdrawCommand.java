package com.asd.finalproject.framework.service.command;

import com.asd.finalproject.framework.service.AccountService;

/**
 * Created by gedionz on 11/22/16.
 */
public class WithdrawCommand implements Command {

    private AccountService accountService;
    private String accountNumber;
    private Double amount;

    public WithdrawCommand(AccountService accountService, String accountNumber, Double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountService.withdraw(accountNumber, amount);
    }
}
