package com.example.mscourse.design_patterns.bahavioral.observer;

public class NotificationAdapterImpl implements NotificationAdapter{
    @Override
    public void sendNotification(User user, String text) {
        System.out.println("--------------------------------");
        System.out.println("Send notification to: " + user.getName());
        System.out.println("Message is: " + text);
    }
}
