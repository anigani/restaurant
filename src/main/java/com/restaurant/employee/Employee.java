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

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return String.format("%s %d  %s ", name, age, sex);
    }
}
