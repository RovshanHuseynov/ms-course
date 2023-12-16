package com.example.mscourse.design_patterns.creational.factory;

public class Car implements Vehicle{
    @Override
    public void deliver() {
        System.out.println("Deliver with Car");
    }
}
