package com.asd.finalproject.framework.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gedionz on 11/21/16.
 */
public class Company extends Customer {
    private int numberOfEmployees;

    public Company(String id, String name, int numberOfEmployees, Address address) {
        super(id, name, address);
        this.numberOfEmployees = numberOfEmployees;
    }


    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

}
