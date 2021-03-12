package uni.pl.fmi;
import java.util.*;

public class Item {

    public Item() {
    }

    private String name;

    private float price;

    private int count;

    private String brand;

	private Set<Order> orders;

	private Set<Category> category;


    public String getName() {
        // TODO implement here
        return name;
    }

    public void setName(String name) {
        // TODO implement here
        this.name=name;
    }

    public float getPrice() {
        // TODO implement here
        return price;
    }

    public void setPrice(float price) {
        // TODO implement here
       this.price=price;
    }

    public int getCount() {
        // TODO implement here
        return count;
    }

    public void setCount(int count) {
        // TODO implement here
        this.count=count;
    }

    public String getBrand() {
        // TODO implement here
        return brand;
    }

    public void setBrand(String brand) {
        // TODO implement here
        this.brand=brand;
    }

    public Set<Order> getOrders() {
        Set<Order> orders = null;
		// TODO implement here
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders=orders;
    }


    public Set<Category> getCategory() {
        Set<Category> categories = null;
		// TODO implement here
        return categories;
    }


    public void setCategories(Set<Category> categories) {
        // TODO implement here
        this.category=categories;
    }

}