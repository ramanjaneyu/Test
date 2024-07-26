package com.test.core.java.solidprinciples.ocp;

/*
This is the right way of creating NotificationService without violating Open Closed Principle.
Here we can extend the class and provide implementation for the respective mediums.
 */
public interface NotificationService {
    public void sendOTP(String medium);
}
