package com.test.core.java.solidprinciples.ocp;

/*
This is the bad way of implementing NotificationService class because this class is tightly coupled
and tomorrow if we want to send notifications using Whatsup then we need to modify this class which
violates the Open Closed Principle. According to OCP, the class should be open for extension and
closed for modification. Hence, it is not recommended.
*/
public class WrongWayOfNotificationService {
    public void sendOTP(String medium){
        if("email".equals(medium)){
            //write email related logic using Java Mail API
        }
        if("mobile".equals(medium)){
            //write mobile related logic using twillio API
        }
    }
}
