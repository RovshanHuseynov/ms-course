package com.example.mscourse.REST.service;

import com.example.mscourse.REST.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public void createEmployee(Employee employee){
        System.out.println(employee);
        System.out.println("save: " + employee.getId());
    }

    @Override
    public Employee getEmployeeById(Long id){
        return new Employee(123, "Rovshan");
    }

    @Override
    public Employee getEmployeeByName(String name){
        return new Employee(123, "Rovshan");
    }

    @Override
    public List<Employee> getAllEmployees(){
        return List.of(
                new Employee(123, "Rovshan"),
                new Employee(133, "Eli"),
                new Employee(145, "Ramal")
        );
    }
}
