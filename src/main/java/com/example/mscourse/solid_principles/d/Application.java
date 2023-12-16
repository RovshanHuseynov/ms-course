package com.example.mscourse.solid_principles.d;

public class Application {
    public static void main(String[] args) {
        Saveable saveable = new SaveableImpl();
        saveable.save(new Square(10));
        saveable.save(new Rectangle(10,20));
        saveable.save(new Triangle(10,20,30));
    }
}
