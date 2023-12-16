package com.example.mscourse.design_patterns.creational.factory;

public class AirplaneFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Airplane();
    }
}
