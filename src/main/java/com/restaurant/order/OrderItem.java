package com.restaurant.order;

import com.restaurant.menu.MenuItem;

public class OrderItem extends MenuItem {
    private int orderNumber;
    private int quantity;

    public OrderItem(int orderNumber, MenuItem menuItem, int quantity) {
        super(menuItem.getType(), menuItem.getNumber(), menuItem.getName(), menuItem.getPrice());
        this.orderNumber = orderNumber;
        this.quantity = quantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("%d. %-20s %.2f x %d AMD", orderNumber, name, price, quantity);
    }
}
