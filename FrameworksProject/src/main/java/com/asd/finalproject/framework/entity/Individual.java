package com.asd.finalproject.framework.entity;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/21/16.
 */
public class Individual extends Customer {
    private LocalDate birthdate;
    public Individual(String customerId, String name, LocalDate birthdate, Address address) {
        super(customerId, name, address);
        this.birthdate = birthdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
