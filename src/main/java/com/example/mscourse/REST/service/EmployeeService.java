package com.example.mscourse.REST.service;

import com.example.mscourse.REST.model.Employee;

import java.util.List;

public interface EmployeeService {
    void createEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    Employee getEmployeeByName(String name);
    List<Employee> getAllEmployees();
}
