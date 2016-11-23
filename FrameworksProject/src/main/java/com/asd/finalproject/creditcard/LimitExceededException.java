package com.asd.finalproject.creditcard;

import com.asd.finalproject.framework.specialstuff.AccountException;

/**
 * Created by gedionz on 11/22/16.
 */
public class LimitExceededException extends AccountException {
    public LimitExceededException(String message) {
        super(message);
    }
}
