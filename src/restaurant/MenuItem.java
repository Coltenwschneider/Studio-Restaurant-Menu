package restaurant;

public class MenuItem {
    public int price;
    public String description;
    public String category;
    public boolean isNew;

    public MenuItem(int price, String description, String category, boolean isNew) {
        this.price = price;
        this. description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public boolean isNew() {
        return this.isNew;
    }


}

