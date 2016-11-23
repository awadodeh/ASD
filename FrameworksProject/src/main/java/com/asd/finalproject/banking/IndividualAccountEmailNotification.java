package com.asd.finalproject.banking;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Customer;
import com.asd.finalproject.framework.entity.Transaction;
import com.asd.finalproject.framework.specialstuff.EmailNotification;
import com.asd.finalproject.framework.specialstuff.Observable;

/**
 * Created by gedionz on 11/22/16.
 */
public class IndividualAccountEmailNotification extends EmailNotification {
    @Override
    public void update(Observable observable, Object arg) {
        Account account = (Account)observable;
        Double amount = (Double)arg;

        Customer accountOwner = account.getCustomer();
        String name = accountOwner.getName();
        String accountNumber = account.getAccountNumber();
        String email = accountOwner.getAddress().getEmail();
        StringBuilder message = new StringBuilder();


        if(amount == null ) {
            message.append("Hello, " + name + "! ");
            message.append("Your account balance is insufficient to make the amount you were trying to withdraw from your account " + accountNumber);
        }else if(amount > 500.0) {
            Transaction lastTransaction = account.getAllTransactions().get(account.getAllTransactions().size() - 1);
            message.append("Hello, " + name + "! ");
            message.append("An amount of " + lastTransaction.getAmount());
            message.append(" has been " + lastTransaction.getDescription());
            message.append(" at " + lastTransaction.getDate());
        }
        sendEmail("donotreply@bank.com", email, message.toString());
    }
}
