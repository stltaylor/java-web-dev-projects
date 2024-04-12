package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        MenuItem pbj = new MenuItem(4,"Peanut butter & Jelly on white bread","Sandwiches",true);
        MenuItem milkShake = new MenuItem(3,"Vanilla,chocolate or strawberry.","Sweet Stuff",false);
        MenuItem reuben = new MenuItem(5,"it's a reuben","Sandwiches",false);
        Date firstMenuDate = new Date();
        ArrayList<MenuItem> menuStuff = new ArrayList<>();
        Menu menu = new Menu(firstMenuDate,menuStuff );
        menu.addItems(pbj);
        menu.addItems(milkShake);
        menu.addItems(reuben);
        menu.printMenu();
        menu.addItems(pbj);
    }
}
