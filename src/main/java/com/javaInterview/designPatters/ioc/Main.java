package com.javaInterview.designPatters.ioc;

// Manually inject dependencies in this simple example, but in real-world applications, IoC containers like Spring handle it for you.
/*
Key Points
	1.	Dependency Injection: The NotificationClient is not responsible for creating the NotificationService.
	    It receives the service through its constructor.
	2.	Flexibility: You can easily switch between EmailNotificationService and SMSNotificationService without changing the client code.
	3.	Loose Coupling: The client depends on an abstraction (NotificationService), not a concrete implementation.
 */


public class Main {

    public static void main(String[] args) {
        // Injecting EmailNotificationService
        NotificationService emailService = new EmailNotificationService();
        NotificationClient emailClient = new NotificationClient(emailService);
        emailClient.notify("Hello, Manish!", "manish@apple.com");

        // Injecting SMSNotificationService
        NotificationService smsService = new SMSNotificationService();
        NotificationClient smsClient = new NotificationClient(smsService);
        smsClient.notify("Hello, Keshav!", "123-456-7890");
    }
}
