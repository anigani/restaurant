package com.restaurant.employee;

import com.restaurant.order.OrderItem;

public class Barmen extends Employee {
    public String name;

    public Barmen(String name, Integer age, Sex sex) {
        super(name, age, sex);
    }


    public String getName() {
        return name;
    }

    public void make(OrderItem orderItem) {
        System.out.println(String.format("Barmen making %d %s", orderItem.getQuantity(), orderItem.getName()));
    }

}
