package com.restaurant;

import com.restaurant.menu.*;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<HotMenuItem> hots;
    private List<ColdMenuItem> colds;
    private List<DrinkMenuItem> drinks;
    private List<DessertMenuItem> desserts;

    public Menu() {
        this.hots = new ArrayList<>();
        this.colds = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.desserts = new ArrayList<>();
    }

    public List<HotMenuItem> getHots() {
        return hots;
    }

    public List<ColdMenuItem> getColds() {
        return colds;
    }

    public List<DrinkMenuItem> getDrinks() {
        return drinks;
    }

    public List<DessertMenuItem> getDesserts() {
        return desserts;
    }

    public void addHotItem(HotMenuItem hotItem) {
        this.hots.add(hotItem);
    }

    public void removeHotItem(HotMenuItem hotItem) {
        this.hots.remove(hotItem);
    }

    public void addColdItem(ColdMenuItem coldItem) {
        this.colds.add(coldItem);
    }

    public void removeColdItem(ColdMenuItem coldItem) {
        this.colds.remove(coldItem);
    }

    public void addDrinkItem(DrinkMenuItem drinkItem) {
        this.drinks.add(drinkItem);
    }

    public void removeDrinkItem(DrinkMenuItem drinkItem) {
        this.drinks.remove(drinkItem);
    }

    public void addDessertItem(DessertMenuItem dessertItem) {
        this.desserts.add(dessertItem);
    }

    public void removeDessertItem(DessertMenuItem dessertItem) {
        this.desserts.remove(dessertItem);
    }

    public MenuItem getMenuItem(int number) {
        for (HotMenuItem hot : hots) {
            if(hot.getNumber() == number){
                return hot;
            }
        }

        for (ColdMenuItem cold : colds) {
            if(cold.getNumber() == number){
                return cold;
            }
        }

        for (DessertMenuItem dessert : desserts) {
            if(dessert.getNumber() == number){
                return dessert;
            }
        }

        for (DrinkMenuItem drink : drinks) {
            if(drink.getNumber() == number){
                return drink;
            }
        }

        return null;
    }

}
