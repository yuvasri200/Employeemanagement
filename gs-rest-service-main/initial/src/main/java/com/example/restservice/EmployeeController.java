package com.example.restservice;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeManager manager = new EmployeeManager();

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        manager.addEmployee(employee);
        return employee;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return manager.getEmployees();
    }
}
