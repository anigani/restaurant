package com.restaurant;

import java.time.LocalTime;

public class Restaurant {
    private String name;
    private String address;
    private LocalTime openTime;
    private LocalTime closeTime;

    private Shift firstShift = new Shift();
    private Shift secondShift = new Shift();
    private Menu menu;

    public Restaurant(String name, String address, LocalTime openDate, LocalTime closeTime) {
        this.name = name;
        this.address = address;
        this.openTime = openDate;
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public Shift getFirstShift() {
        return firstShift;
    }

    public Shift getSecondShift() {
        return secondShift;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
