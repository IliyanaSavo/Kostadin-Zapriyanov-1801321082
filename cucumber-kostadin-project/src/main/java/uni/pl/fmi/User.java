package uni.pl.fmi;
import java.util.*;

public class User {

    public User() {
    }

    

    private String password;

    private String firstName;

    private String lastName;

    public Set<Order> orders;

	private String username;

    public void setUsername(String username) {
        // TODO implement here
        this.username=username;
    }

    public String getPassword() {
        // TODO implement here
        return password;
    }

    public void setPassword(String pass) {
        // TODO implement here
        this.password = pass;
    }

    public String getEmail() {
        String email = null;
		// TODO implement here
        return email;
    }

 
    public void setEmail(String email) {
    }


    public String getFirstName() {
        // TODO implement here
        return firstName;
    }


    public void setFirstName(String firstName) {
        // TODO implement here
        this.firstName=firstName;
    }

    public String getLastName() {
        // TODO implement here
        return lastName;
    }

    public void setLastName(String lastName) {
        // TODO implement here
        this.lastName=lastName;
    }

    public Set<Order> getOrders() {
        // TODO implement here
        return orders;
    }

    public void setOreders(Set<Order> orders) {
        // TODO implement here
        this.orders=orders;
    }

    public void addOreder(Order order) {
    	if(null == orders) {
    		this.orders= new HashSet<Order>();
    	}
    	
       this.orders.add(order);
    }

	public String getUsername() {
		return username;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}