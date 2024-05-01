package com.assignment.question;

import com.assignment.question.notification.EmailNotification;
import com.assignment.question.notification.Notification;
import com.assignment.question.sender.EmailNotificationSender;
import com.assignment.question.sender.NotificationSender;
import com.assignment.question.template.EmailNotificationTemplate;
import com.assignment.question.template.NotificationTemplate;

// Concrete factory class for creating email notifications
public class EmailNotificationFactory extends NotificationFactory {
    // Method for getting the type of notification the factory supports
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    // Methods for creating different parts of an email notification
    @Override
    public Notification createNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationTemplate createTemplate(String templateName) {
        return new EmailNotificationTemplate(templateName);
    }

    @Override
    public NotificationSender createSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }
}