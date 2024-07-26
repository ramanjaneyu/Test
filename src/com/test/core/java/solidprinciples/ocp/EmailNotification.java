package com.test.core.java.solidprinciples.ocp;

/*
This is the right way of writing NotificationService as here in future if we want to
any new feature i.e., Whatsup notification we can extend the class and provide implementation
for Whatsup and thus we are not modifying the class.
 */
public class EmailNotification implements NotificationService {
    @Override
    public void sendOTP(String medium) {
        //write email related logic using Java Mail API
    }
}
