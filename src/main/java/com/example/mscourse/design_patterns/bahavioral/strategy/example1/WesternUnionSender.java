package com.example.mscourse.design_patterns.bahavioral.strategy.example1;

public class WesternUnionSender implements Sendible {
    @Override
    public void send(int amount) {
        System.out.println("send money with WESTERN UNION");
    }
}
