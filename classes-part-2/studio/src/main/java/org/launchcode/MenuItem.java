package org.launchcode;

import javax.swing.*;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateUpdated;

    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    public boolean equals(MenuItem item) {
        return this.price == item.getPrice() && this.getCategory().equals(item.category) && this.getDescription().equals(item.category);


    }
}

