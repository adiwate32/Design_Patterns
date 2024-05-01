package com.assignment.question;

public class EmailNotification extends Notification{

    private String sender;

    public EmailNotification(String recipient, String sender, String message) {
        super(recipient, sender);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " +  super.getRecipient()+ " from " + sender);
        System.out.println("Message: " + super.getMessage());
    }

    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}