package com.restaurant;

import com.restaurant.menu.MenuItem;
import com.restaurant.order.Order;

import java.util.Scanner;

public class Client {
    private Scanner scanner = new Scanner(System.in);

    public Order placeOrder(Menu menu) {
        Order order = new Order();

        readInput(order, menu);

        return order;
    }

    private void readInput(Order order, Menu menu) {
        System.out.println("Please input your order. To finish input 0.");
        int counter = 1;
        int number, quantity;
        while (true) {
            System.out.print("Menu item number: ");
            number = scanner.nextInt();
            if (number == 0) break;
            MenuItem menuItem = menu.getMenuItem(number);
            if(menuItem == null){
                System.out.println("Invalid menu item!");
                continue;
            }

            System.out.print("quantity: ");
            quantity = scanner.nextInt();
            if (quantity == 0) break;

            order.addOrderItem(counter, menuItem, quantity);
            counter++;
        }
    }
}

