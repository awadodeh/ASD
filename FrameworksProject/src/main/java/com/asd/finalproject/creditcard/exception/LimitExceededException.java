package com.asd.finalproject.creditcard.exception;

import com.asd.finalproject.framework.service.exception.AccountException;

/**
 * Created by gedionz on 11/22/16.
 */
public class LimitExceededException extends AccountException {
    public LimitExceededException(String message) {
        super(message);
    }
}
