package com.asd.finalproject.banking;

import com.asd.finalproject.framework.entity.Account;
import com.asd.finalproject.framework.entity.Address;
import com.asd.finalproject.framework.entity.Customer;
import com.asd.finalproject.framework.specialstuff.EmailNotification;
import com.asd.finalproject.framework.specialstuff.Observable;

/**
 * Created by gedionz on 11/22/16.
 */

public class CompanyAccountEmailNotification extends EmailNotification {
    @Override
    public void update(Observable observable, Object arg) {
        Account account = (Account)observable;
        Double amount = (Double)arg;

        Customer company = account.getCustomer();
        String email = company.getAddress().getEmail();

    }
}
