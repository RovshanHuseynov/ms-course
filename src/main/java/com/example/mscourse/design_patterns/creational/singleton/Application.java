package com.example.mscourse.design_patterns.creational.singleton;

public class Application {
    public static void main(String[] args) {
        SingletonCar.SINGLETON_CAR.doSomething();
        System.out.println(SingletonCar.SINGLETON_CAR.hashCode());
        System.out.println(SingletonCar.SINGLETON_CAR.hashCode());
        System.out.println(SingletonCar.SINGLETON_CAR.hashCode());
    }
}
