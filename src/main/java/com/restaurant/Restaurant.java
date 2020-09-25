package com.restaurant;

import com.restaurant.menu.*;
import com.restaurant.order.Order;
import com.restaurant.order.OrderItem;

import java.time.LocalDate;
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

    public Shift getShift() {
        LocalDate currentDate = LocalDate.now();

        if (currentDate.getDayOfMonth() % 2 == 0) {
            return firstShift;
        } else {
            return secondShift;
        }
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setFirstShift(Shift firstShift) {
        this.firstShift = firstShift;
    }

    public void setSecondShift(Shift secondShift) {
        this.secondShift = secondShift;
    }

    public void serveClient(Client client) {
        System.out.println("Serving client ...");
        printMenu(menu);
        Order order = takeOrder(client);
        prepareOrder(order);
        Bill bill = getBill(order);
        printBill(bill);
    }

    private void prepareOrder(Order order) {
        for (OrderItem orderItem : order.getOrderItems()) {
            if (MenuType.DRINK.equals(orderItem.getType())) {
                getShift().getBarmen().make(orderItem);
            }
        }
    }

    private void printMenu(Menu menu) {
        System.out.println("================== MENU ==================");
        System.out.println("Hot items");
        for (HotMenuItem hot : menu.getHots()) {
            System.out.println("\t" + hot);
        }

        System.out.println("Cold items");
        for (ColdMenuItem cold : menu.getColds()) {
            System.out.println("\t" + cold);
        }

        System.out.println("Drinks");
        for (DrinkMenuItem drink : menu.getDrinks()) {
            System.out.println("\t" + drink);
        }

        System.out.println("Desserts");
        for (DessertMenuItem dessert : menu.getDesserts()) {
            System.out.println("\t" + dessert);
        }
        System.out.println("==========================================");
    }

    private Order takeOrder(Client client) {
        System.out.println("Taking order...");
        return client.placeOrder(menu);
    }

    private Bill getBill(Order order) {
        Bill bill = new Bill(order.getOrderItems());

        bill.calculate();

        return bill;
    }

    private void printBill(Bill bill) {
        System.out.println("================== Bill ==================");
        for (OrderItem orderItem : bill.getOrderItems()) {
            System.out.println(orderItem);
        }
        System.out.println("------------------------------------------");
        System.out.println(String.format("%-23s %.2f", "Commission: ", bill.getCommission()));
        System.out.println(String.format("%-23s %.2f", "Total: ", bill.getTotal()));
        System.out.println("==========================================");
    }

    public void open() {
        System.out.println("Welcome to restaurant \"" + name + "\" located at " + address + "!");
        System.out.println("Opening at " + openTime);
        System.out.println("==========================================");
    }

    public void close() {
        System.out.println("Closing at " + closeTime);
        System.out.println("================== GOOD BY ==================");
    }
}
