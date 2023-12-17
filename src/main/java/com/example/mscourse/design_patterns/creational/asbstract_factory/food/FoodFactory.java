package com.example.mscourse.design_patterns.creational.asbstract_factory.food;

import com.example.mscourse.design_patterns.creational.asbstract_factory.CompanyFactory;

public interface FoodFactory extends CompanyFactory {
    Food createFood();
}
