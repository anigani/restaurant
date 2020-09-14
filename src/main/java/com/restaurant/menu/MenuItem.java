package com.restaurant.menu;

public abstract class MenuItem {
    protected int number;
    protected String name;
    protected float price;
    private MenuType type;

    public MenuItem(MenuType type, int number, String name, float price) {
        this.type = type;
        this.number = number;
        this.name = name;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public MenuType getType() {
        return type;
    }

    @Override
    public String toString() {
        return String.format("%d. %-20s %.2f AMD", number, name, price);
    }
}
