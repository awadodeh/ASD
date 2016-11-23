package com.asd.finalproject.framework.specialstuff;

import com.asd.finalproject.framework.service.AccountService;

/**
 * Created by gedionz on 11/22/16.
 */
public class DepositCommand implements Command {

    private AccountService accountService;
    private String accountNumber;
    private Double amount;

    public DepositCommand(AccountService accountService, String accountNumber, Double amount) {
        this.accountService = accountService;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    @Override
    public void execute() {
        accountService.deposit(accountNumber, amount);
    }
}
