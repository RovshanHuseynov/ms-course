package com.example.mscourse.design_patterns.bahavioral.observer;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PriceObserverImpl implements PriceObserver{
    private final NotificationAdapter notificationAdapter;

    @Override
    public void sendNotification(List<User> users) {
        users.forEach(u -> notificationAdapter.sendNotification(u,
                "There is a decent discount in price which you subscribe. Please check your account"));
    }
}
