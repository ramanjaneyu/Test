package com.test.design.factory;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {
    private static final Map<String, Notification> notificationMap = new HashMap<>();
    static{
        notificationMap.put("SMS", new SMSNotification());
        notificationMap.put("EMAIL", new EmailNotification());
    }
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty())
            return null;

        /*switch (channel) {
            case "SMS":
                    return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknow channel : " + channel);
        }*/
        return notificationMap.get(channel);
    }
}
