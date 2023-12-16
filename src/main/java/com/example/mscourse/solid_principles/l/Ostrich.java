package com.example.mscourse.solid_principles.l;

public class Ostrich implements Birdable{
    @Override
    public void fly() {
        throw new RuntimeException("sorry, I cannot fly");
    }

    @Override
    public void walk() {
        System.out.println("okay I am walking");
    }

    @Override
    public void eat() {
        System.out.println("okay I am eating");
    }
}
