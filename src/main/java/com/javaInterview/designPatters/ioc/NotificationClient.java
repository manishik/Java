package com.javaInterview.designPatters.ioc;

// Client Class
// The client class will depend on the NotificationService interface but won’t control which implementation it uses.

public class NotificationClient {

    private NotificationService notificationService;

    // Constructor Injection
    public NotificationClient(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notify(String message, String recipient) {
        notificationService.sendNotification(message, recipient);
    }

}
