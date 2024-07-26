package com.test.core.java.solidprinciples.srp;

public class NotificationService {
    public void sendOTP(String medium){
        if("email".equals(medium)){
            //write email related logic using Java Mail API
        }
        if("mobile".equals(medium)){
            //write mobile related logic using twillio API
        }
    }
}
