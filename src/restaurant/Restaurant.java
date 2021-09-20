package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        Date menuDate = new Date();
        MenuItem menuItem1 = new MenuItem(10, "Onion Rings", "Appetizer", false);
        MenuItem menuItem2 = new MenuItem(15, "Chicken", "Main Course", false);
        MenuItem menuItem3 = new MenuItem(5, "Cookies and Milk", "Dessert", true);
        Menu menu = new Menu(menuItems, menuDate);
        menu.addItem(menuItem1);
        menu.addItem(menuItem2);
        menu.addItem(menuItem3);
        Menu.printMenu(menu);
        menu.removeItem(menuItem3);
        Menu.printMenu(menu);
    }
}
