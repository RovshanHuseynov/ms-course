package com.example.mscourse.design_patterns.structural.decorator;

public class DatabaseProxy extends Database {
    public int getSalaryById(long id){
        System.out.println("Decorator is being executed");
        int initialSalary = super.getSalaryById(id);
        System.out.println("initialSalary was: " + initialSalary);
        System.out.println("promoted salary is: " + promoteEmployee(initialSalary));
        return promoteEmployee(initialSalary);
    }

    private int promoteEmployee(int salary){
        return 2*salary;
    }
}
