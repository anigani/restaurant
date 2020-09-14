package com.restaurant.menu;

public class HotMenuItem extends MenuItem {

    public HotMenuItem(int number, String name, float price) {
        super(MenuType.HOT, number, name, price);
    }
}
