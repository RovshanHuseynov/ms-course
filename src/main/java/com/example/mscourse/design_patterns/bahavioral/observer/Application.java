package com.example.mscourse.design_patterns.bahavioral.observer;

import java.util.List;
import java.util.Random;

public class Application {

    private static final PriceObserver priceObserver = new PriceObserverImpl(new NotificationAdapterImpl());
    public static void main(String[] args) {
        User user1 = new User(1, "Rovshan");
        User user2 = new User(2, "Orxan");
        User user3 = new User(3, "Sabir");
        User user4 = new User(4, "Eli");

        Random random = new Random();
        int price = random.nextInt(800);
        System.out.println("price is: " + price);

        if (price < 500) {
            priceObserver.sendNotification(List.of(user1, user2, user3, user4));
        } else if (price < 600) {
            priceObserver.sendNotification(List.of(user1, user2, user3));
        } else if (price < 700) {
            priceObserver.sendNotification(List.of(user1, user2));
        }
    }
}
