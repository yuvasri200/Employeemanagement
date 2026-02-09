package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
