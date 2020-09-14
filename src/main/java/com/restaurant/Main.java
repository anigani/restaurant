package com.restaurant;

import com.restaurant.employee.*;
import com.restaurant.menu.ColdMenuItem;
import com.restaurant.menu.DessertMenuItem;
import com.restaurant.menu.DrinkMenuItem;
import com.restaurant.menu.HotMenuItem;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        final Restaurant restaurant = createRestaurant();
        final Client client = new Client();

        restaurant.open();
        restaurant.serveClient(client);
        restaurant.close();
    }

    private static Restaurant createRestaurant() {
        final Restaurant restaurant = new Restaurant("QA Arena", "SoftConstruct", LocalTime.of(10, 0, 0), LocalTime.of(23, 0, 0));

        final Shift firstShift = restaurant.getFirstShift();
        firstShift.addEmployee(new Barmen("Karen", 30, Sex.MALE));
        firstShift.addEmployee(new Cook("Petros", 35, Sex.MALE));
        firstShift.addEmployee(new Waiter("Lusine", 35, Sex.FEMALE));
        firstShift.addEmployee(new Manager("Anna", 31, Sex.FEMALE));

        final Shift secondShift = restaurant.getSecondShift();
        secondShift.addEmployee(new Barmen("Khoren", 30, Sex.MALE));
        secondShift.addEmployee(new Cook("Poxos", 35, Sex.MALE));
        secondShift.addEmployee(new Waiter("Lilit", 32, Sex.FEMALE));
        secondShift.addEmployee(new Manager("Anna", 31, Sex.FEMALE));

        restaurant.setMenu(createMenu());
        return restaurant;
    }

    private static Menu createMenu() {
        final Menu menu = new Menu();

        menu.addHotItem(new HotMenuItem(1, "Barbecue", 3500.0f));
        menu.addHotItem(new HotMenuItem(2, "Mushrooms", 3000.0f));

        menu.addColdItem(new ColdMenuItem(3, "Cesar salad", 2000.0f));
        menu.addColdItem(new ColdMenuItem(4, "Greece salad", 1500.0f));

        menu.addDrinkItem(new DrinkMenuItem(5, "Coffee", 600.0f));
        menu.addDrinkItem(new DrinkMenuItem(6, "Dry wine", 1600.0f));

        menu.addDessertItem(new DessertMenuItem(7,"Napoleon", 800.0f));
        menu.addDessertItem(new DessertMenuItem(8, "Ice-cream", 1000.0f));
        return menu;
    }

}
