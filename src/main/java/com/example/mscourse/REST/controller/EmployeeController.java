package com.example.mscourse.REST.controller;

import com.example.mscourse.REST.model.Employee;
import com.example.mscourse.REST.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/")
public class EmployeeController {
    private final EmployeeService employeeService;

    @PostMapping("/employee")
    public void createEmployee(Employee employee){
        employeeService.createEmployee(employee);
    }
}
