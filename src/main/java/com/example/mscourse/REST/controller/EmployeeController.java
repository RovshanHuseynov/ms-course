package com.example.mscourse.REST.controller;

import com.example.mscourse.REST.model.Employee;
import com.example.mscourse.REST.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class EmployeeController {
    private final EmployeeService employeeService;

    // http://localhost:8080/api/v1/employees
    @PostMapping("employees")
    public void createEmployee(Employee employee){
        employeeService.createEmployee(employee);
    }

    // http://localhost:8080/api/v1/employees/1
    @GetMapping("employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    // http://localhost:8080/api/v1/employee?name=Eli
    @GetMapping("employee")
    public Employee getEmployeeByName(@RequestParam String name){
        return employeeService.getEmployeeByName(name);
    }

    // http://localhost:8080/api/v1/employees
    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }
}
