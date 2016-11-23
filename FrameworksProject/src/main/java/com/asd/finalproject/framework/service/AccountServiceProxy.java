package com.asd.finalproject.framework.service;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.service.command.Command;
import com.asd.finalproject.framework.service.command.DepositCommand;
import com.asd.finalproject.framework.service.command.InterestCommand;
import com.asd.finalproject.framework.service.command.WithdrawCommand;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by gedionz on 11/21/16.
 */
public class AccountServiceProxy implements AccountService {

    private AccountService accountService;
    private Stack<Command> history = new Stack<>();

    public AccountServiceProxy(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void createAccount(Account account) {
        accountService.createAccount(account);
    }

    @Override
    public Account getAccount(String accountNumber) {
        return accountService.getAccount(accountNumber);
    }

    @Override
    public Map<String, Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @Override
    public void deposit(String accountNumber, Double amount) {
        
        System.out.println("AccountServiceProxy.deposit() "+accountNumber);

        if(amount != null && accountNumber != null && !accountNumber.isEmpty()) {
            Command depositCommand = new DepositCommand(accountService, accountNumber, amount);
            depositCommand.execute();

            history.push(depositCommand);
        }
    }

    @Override
    public void withdraw(String accountNumber, Double amount) {
        System.out.println("AccountServiceProxy.withdraw() " + accountNumber);

        Command withdrawCommand = new WithdrawCommand(accountService, accountNumber, amount);
        withdrawCommand.execute();

        history.push(withdrawCommand);
    }

    @Override
    public void addInterest() {
        System.out.println("AccountServiceProxy.addInterest() ");
        Command interestCommand = new InterestCommand(accountService);
        interestCommand.execute();

        history.push(interestCommand);
    }

    @Override
    public List<String> generateReport(String[] accountNumbers, LocalDate from, LocalDate to) {
        return accountService.generateReport(accountNumbers, from, to);
    }
}
