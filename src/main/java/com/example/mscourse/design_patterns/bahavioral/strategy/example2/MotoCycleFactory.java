package com.example.mscourse.design_patterns.bahavioral.strategy.example2;

public class MotoCycleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Motocycle();
    }
}
