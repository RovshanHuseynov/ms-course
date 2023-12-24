package com.example.mscourse.design_patterns.bahavioral.strategy;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Random random = new Random();
        int amount = random.nextInt(5000);
        System.out.println("price is: " + amount);
        SendMoneyStrategy strategy = new SendMoneyStrategy();
        strategy.sendMoney(amount);
    }
}
