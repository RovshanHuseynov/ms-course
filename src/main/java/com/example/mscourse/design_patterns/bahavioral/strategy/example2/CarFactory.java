package com.example.mscourse.design_patterns.bahavioral.strategy.example2;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
