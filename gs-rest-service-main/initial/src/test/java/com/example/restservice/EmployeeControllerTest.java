package com.example.restservice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeControllerTest {

    @Test
    void testAddEmployee() {
        EmployeeManager manager = new EmployeeManager();

        Employee emp = new Employee();
        emp.setFirst_name("Yuvasri");
        emp.setLast_name("S");
        emp.setEmployee_id(101);
        emp.setEmail("yuva@test.com");
        emp.setTitle("Developer");

        manager.addEmployee(emp);

        assertEquals(1, manager.getEmployees().size());
    }

    @Test
    void testGetEmployees() {
        EmployeeManager manager = new EmployeeManager();

        Employee emp1 = new Employee();
        emp1.setFirst_name("A");
        emp1.setLast_name("B");
        emp1.setEmployee_id(1);
        emp1.setEmail("a@test.com");
        emp1.setTitle("Tester");

        Employee emp2 = new Employee();
        emp2.setFirst_name("C");
        emp2.setLast_name("D");
        emp2.setEmployee_id(2);
        emp2.setEmail("c@test.com");
        emp2.setTitle("Manager");

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        assertEquals(2, manager.getEmployees().size());
    }
}

