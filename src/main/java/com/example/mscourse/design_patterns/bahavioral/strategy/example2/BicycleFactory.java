package com.example.mscourse.design_patterns.bahavioral.strategy.example2;

public class BicycleFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}
