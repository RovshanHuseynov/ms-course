package com.example.mscourse.design_patterns.bahavioral.strategy;

public class ZolotoyaKoronaSender implements Sendible {
    @Override
    public void send(int amount) {
        System.out.println("send money with ZOLOTOYA KORONA");
    }
}
