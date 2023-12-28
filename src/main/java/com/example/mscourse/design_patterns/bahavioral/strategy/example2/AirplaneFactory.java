package com.example.mscourse.design_patterns.bahavioral.strategy.example2;

public class AirplaneFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Airplane();
    }
}
