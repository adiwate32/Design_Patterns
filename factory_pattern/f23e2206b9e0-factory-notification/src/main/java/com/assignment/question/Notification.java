package com.assignment.question;

public abstract class Notification {

    private String recipient;
    private String message;

    Notification(String recipient, String message){
        this.recipient = recipient;
        this.message = message;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }
}