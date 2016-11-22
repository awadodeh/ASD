package com.asd.finalproject.framework.entity;

/**
 * Created by gedionz on 11/21/16.
 */
public abstract class Customer {
    private String id;
    private String name;
    private Address address;

    public Customer(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
