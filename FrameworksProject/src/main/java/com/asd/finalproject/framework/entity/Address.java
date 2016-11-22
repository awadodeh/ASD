package com.asd.finalproject.framework.entity;

/**
 * Created by gedionz on 11/21/16.
 */
public class Address {

    private final String street;
    private final String city;
    private final String zipCode;
    private final USState state;
    private final String email;

    public Address(String street, String city, String zipCode, USState state, String email) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.email = email;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public USState getState() {
        return state;
    }

    public String getEmail() { return email; }
}
