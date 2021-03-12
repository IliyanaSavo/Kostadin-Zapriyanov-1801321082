package uni.pl.fmi;
import java.util.*;

public class Order {

    private int orderNumber;

    private String orderStatus;

    private double orderValue;

    public Set<User> user;

    public Set<Item> item;

    public int getOrderNumber() {
        // TODO implement here
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        // TODO implement here
        this.orderNumber=orderNumber;
    }

    public String getOrderStatus() {
        // TODO implement here
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        // TODO implement here
        this.orderStatus=orderStatus;
    }

    public double getOrderValue() {
        // TODO implement here
        return orderValue;
    }


    public void setOrderValue(double orderValue) {
        // TODO implement here
        this.orderValue=orderValue;
    }

    public Set<User> getUsers() {
        Set<User> users = null;
		// TODO implement here
        return users;
    }

    public void setUsers(Set<User> users) {
        // TODO implement here
        this.user=users;
    }

    public Set<Item> getItems() {
        // TODO implement here
        return item;
    }

    public void setItems(Set<Item> Items) {
        // TODO implement here
        this.item=Items;
    }

}