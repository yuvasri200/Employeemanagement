package com.example.restservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }


    @GetMapping("/employees")
    public Employees getAllEmployees() {
        return employeeManager.getEmployees();
    }


    @PostMapping("/employees")
    public void addEmployee(@RequestBody com.example.restservice.Employee employee) {
        employeeManager.getEmployees().getEmployeeList().add(employee);
    }
}
