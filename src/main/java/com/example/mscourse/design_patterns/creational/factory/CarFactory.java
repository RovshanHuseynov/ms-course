package com.example.mscourse.design_patterns.creational.factory;

public class CarFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
