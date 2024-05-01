package com.assignment.question;

public class NotificationFactory {

    public static Notification getFactoryObj(NotificationType notificationType, String sender, String message, String recipient){
        switch (notificationType){
            case SMS -> {
                return new SmsNotification(recipient, message);
            }
            case PUSH -> {
                return new PushNotification(recipient, message);
            }
            case EMAIL -> {
                return new EmailNotification(recipient, sender, message);
            }
        }
        return null;
    }
}