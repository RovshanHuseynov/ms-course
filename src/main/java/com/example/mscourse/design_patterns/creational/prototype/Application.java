package com.example.mscourse.design_patterns.creational.prototype;

public class Application {
    private static Employee employee;

    public static void main(String[] args) {
        employee = new Employee(1, "Rovshan");
        System.out.println(employee);
        employee = new Employee(2, "Mushviq");
        System.out.println(employee);
    }
}
