package com.example.mscourse.design_patterns.bahavioral.strategy.example1;

public class ZolotoyaKoronaSender implements Sendible {
    @Override
    public void send(int amount) {
        System.out.println("send money with ZOLOTOYA KORONA");
    }
}
