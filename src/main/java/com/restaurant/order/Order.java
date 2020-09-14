package com.restaurant.order;

import com.restaurant.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems;

    public Order() {
        this.orderItems = new ArrayList<>();
    }

    public void addOrderItem(int orderNumber, MenuItem menuItem, int quantity){
        OrderItem orderItem = new OrderItem(orderNumber, menuItem, quantity);
        orderItems.add(orderItem);
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}

