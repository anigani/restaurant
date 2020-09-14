package com.restaurant;

import com.restaurant.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class Shift {
    private List<Employee> employees;

    public Shift() {
        this.employees = new ArrayList<>();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }
}
