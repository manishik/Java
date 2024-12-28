package com.javaInterview.designPatters.ioc;

// Implement Concrete Services

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + " with message: " + message);
    }
}
