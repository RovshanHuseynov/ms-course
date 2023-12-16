package com.example.mscourse.solid_principles.l;

public class Sparrow implements Birdable{
    @Override
    public void fly() {
        System.out.println("okay I am flying");
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
