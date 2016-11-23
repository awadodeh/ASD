package com.asd.finalproject.framework.service.notification;

/**
 * Created by gedionz on 11/21/16.
 */
public abstract class Notification implements Observer {
    private String description;

    public Notification(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
