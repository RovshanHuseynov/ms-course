package com.example.mscourse.design_patterns.bahavioral.observer;

import java.util.List;

public interface PriceObserver {
    void sendNotification(List<User> users);
}
