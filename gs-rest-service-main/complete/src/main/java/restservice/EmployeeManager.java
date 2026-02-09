package restservice;

import java.util.Arrays;

public class EmployeeManager {

    private Employees employees;

    public EmployeeManager() {
        employees = new Employees(Arrays.asList(
                new Employee(1, "John", "Doe", "john.doe@example.com", "Developer"),
                new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Tester"),
                new Employee(3, "Bob", "Johnson", "bob.johnson@example.com", "Manager")
        ));
    }

    public Employees getEmployees() {
        return employees;
    }
}
