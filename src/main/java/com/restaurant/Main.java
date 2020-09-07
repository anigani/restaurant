package com.restaurant;

import com.restaurant.employee.*;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("QA Arena", "SoftConstruct", LocalTime.of(10, 0, 0), LocalTime.of(23, 0, 0));

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

        restaurant.setMenu(new Menu());
    }

}
