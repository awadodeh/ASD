package com.asd.finalproject.banking.exception;

import com.asd.finalproject.framework.service.exception.AccountException;

/**
 * Created by gedionz on 11/22/16.
 */
public class InsufficientBalanceException extends AccountException {

    public InsufficientBalanceException() {
        super("Insufficient balance exception");
    }
}
