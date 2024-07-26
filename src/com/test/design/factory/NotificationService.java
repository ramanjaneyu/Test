package com.test.design.factory;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification("EMAIL");
        notification.notifyUser();
    }
}
