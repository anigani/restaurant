package com.restaurant.employee;

public abstract class Employee {
    private String name;
    private Integer age;
    private Sex sex;

    public Employee(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
