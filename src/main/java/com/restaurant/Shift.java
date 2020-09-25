package com.restaurant;

import com.restaurant.employee.Barmen;
import com.restaurant.employee.Employee;
import com.restaurant.employee.Waiter;

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

    public Waiter getWaiter() {
        for (Employee e : employees) {
            if (e instanceof Waiter) {
                return (Waiter) e;
            }
        }

        return null;
    }

    public Barmen getBarmen() {
        for (Employee e : employees) {
            if (e instanceof Barmen) {
                return (Barmen) e;
            }
        }

        return null;
    }

}
