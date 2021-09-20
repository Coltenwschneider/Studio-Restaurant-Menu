package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Menu {
    public ArrayList<MenuItem> menuItems;
    public Date menuDate;

    public MenuItem item = new MenuItem(2,"chicken", "meat", true);

    // create empty menu items array
    // create date object
    // create menu object
    // create menu item object
    // add the menu item objects to the empty menu items array you created

    public Menu(ArrayList<MenuItem> menuItems, Date menuDate) {
        this.menuItems = menuItems;
        this.menuDate = menuDate;
    }

    public void addItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    public Date getMenuDate() {
        return this.menuDate;
    }

    public void printItem(MenuItem menuItem) {
        System.out.println(menuItem);
    }

    public static void printMenu(Menu menu) {
        System.out.println("Menu: \n");
        for (MenuItem menuItem: menu.menuItems) {
            System.out.println("Item: \n");
            System.out.println("Price: " + menuItem.price);
            System.out.println("Category: " + menuItem.category);
            System.out.println("Description: " + menuItem.description + "\n");
        }
    }

    public boolean isEqual(MenuItem menuItem) {
        return this.menuItems.contains(menuItem);
    }






}
