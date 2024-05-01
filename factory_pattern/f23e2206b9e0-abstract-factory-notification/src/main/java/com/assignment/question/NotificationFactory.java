package com.assignment.question;

import com.assignment.question.notification.Notification;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.template.NotificationTemplate;

// Abstract factory class for creating different parts of a notification system
public abstract class NotificationFactory {
    // Abstract method for getting the type of notification the factory supports
    public abstract NotificationType notificationType();

    // Abstract methods for creating different parts of a notification system
    public abstract Notification createNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationTemplate createTemplate(String templateName);
    public abstract NotificationSender createSender(Notification notification);
}