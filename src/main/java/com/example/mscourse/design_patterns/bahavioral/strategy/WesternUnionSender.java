package com.example.mscourse.design_patterns.bahavioral.strategy;

public class WesternUnionSender implements Sendible {
    @Override
    public void send(int amount) {
        System.out.println("send money with WESTERN UNION");
    }
}
