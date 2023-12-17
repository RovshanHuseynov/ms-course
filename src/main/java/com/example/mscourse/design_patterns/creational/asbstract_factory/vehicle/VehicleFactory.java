package com.example.mscourse.design_patterns.creational.asbstract_factory.vehicle;

import com.example.mscourse.design_patterns.creational.asbstract_factory.CompanyFactory;

public interface VehicleFactory extends CompanyFactory {
    Vehicle createVehicle();
}
