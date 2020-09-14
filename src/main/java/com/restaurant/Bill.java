package com.restaurant;

import com.restaurant.order.OrderItem;

import java.util.List;

public class Bill {
    private List<OrderItem> orderItems;
    private double commission;
    private double total;

    public Bill(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getCommission() {
        return commission;
    }

    public double getTotal() {
        return total;
    }

    public void calculate() {
        System.out.println("Calculating bill ...");
        double sum = 0;
        for (OrderItem item : orderItems) {
            sum += item.getPrice() * item.getQuantity();
        }
        commission = sum * 0.1;
        total = sum + commission;
    }
}
