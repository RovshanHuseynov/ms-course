package com.example.mscourse.design_patterns.creational.asbstract_factory.vehicle;

public class Airplane implements Vehicle {
    @Override
    public void deliver() {
        System.out.println("Deliver with Airplane");
    }
}
