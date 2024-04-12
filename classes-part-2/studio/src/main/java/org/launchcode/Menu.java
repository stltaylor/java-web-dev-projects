package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {
    private Date lastUpdated;
    private static ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItems(MenuItem item) {
        if (this.getItems().contains(item)) {
            System.out.println("Item already added");
        } else {
            items.add(item);
        }

    }
    public static void removeItem(MenuItem item) {
        items.remove(item);
    }
    public Date getLastUpdated(MenuItem item) {
        return this.lastUpdated;
    }
    public static void printItem(MenuItem item) {
        System.out.println(item.getDescription());
        System.out.println(item.getCategory());
        System.out.println(item.getPrice());
    }
    public static void printMenu() {
        for (MenuItem item: items) {
            printItem(item);
        }
    }




}


