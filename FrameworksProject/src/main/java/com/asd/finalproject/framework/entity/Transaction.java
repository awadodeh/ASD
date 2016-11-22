package com.asd.finalproject.framework.entity;

import java.time.LocalDate;

/**
 * Created by gedionz on 11/22/16.
 */
public class Transaction {
    private Double amount;
    private LocalDate date;
    private String description;

    public Transaction(Double amount, LocalDate date, String description) {
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
