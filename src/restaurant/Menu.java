package restaurant;

import java.util.Date;

public class Menu {
    public MenuItem[] menuItems;
    public Date menuDate;

    public Menu(MenuItem[] menuItems, Date menuDate) {
        this.menuItems = menuItems;
        this.menuDate = menuDate;
    }



}
