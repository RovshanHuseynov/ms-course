package com.example.mscourse.design_patterns.structural.decorator;

public class Application {
    public static void main(String[] args) {
        Database db = new DatabaseProxy();
        System.out.println(db.getSalaryById(100));
    }
}
