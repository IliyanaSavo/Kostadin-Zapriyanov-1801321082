package uni.pl.fmi;
import java.util.*;

public class Order {

    private int orderNumber;

    private String orderStatus;

    private double orderValue;

    public Set<User> user;

    public Set<Item> item;

	private String arts;

	private String startOrder;

	private String enterNames;

	private String enterPhone;

	private String enterAdress;

    public Order(String arts, String startOrder, String enterNames, String enterAdress, String enterPhone) {
		super();
		this.arts = arts;
		this.startOrder = startOrder;
		this.enterNames = enterNames;
		this.enterAdress = enterAdress;
		this.enterPhone = enterPhone;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}

	public String getArts() {
		return arts;
	}

	public void setArts(String arts) {
		this.arts = arts;
	}

	public String getStartOrder() {
		return startOrder;
	}

	public void setStartOrder(String startOrder) {
		this.startOrder = startOrder;
	}

	public String getEnterNames() {
		return enterNames;
	}

	public void setEnterNames(String enterNames) {
		this.enterNames = enterNames;
	}

	public String getEnterPhone() {
		return enterPhone;
	}

	public void setEnterPhone(String enterPhone) {
		this.enterPhone = enterPhone;
	}

	public String getEnterAdress() {
		return enterAdress;
	}

	public void setEnterAdress(String enterAdress) {
		this.enterAdress = enterAdress;
	}

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