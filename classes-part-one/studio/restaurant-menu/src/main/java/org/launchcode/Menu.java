package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date dateUpdated;
    private ArrayList<MenuItem> menu;

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public Menu(ArrayList<MenuItem> menu, Date dateUpdated) {
        this.menu = menu;
        this.dateUpdated = dateUpdated;
    }
}
