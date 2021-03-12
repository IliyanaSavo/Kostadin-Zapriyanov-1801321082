package uni.pl.fmi;
import java.util.*;

/**
 * 
 */
public class Category {

    public Category() {
    }

    private String name;

    private String type;

    private String filter;

    public Set<Item> items;

    public Set<Category> children;

    public String getName() {
        // TODO implement here
        return name;
    }


    public void setName(String name) {
        // TODO implement here
       this.name=name;
    }

    public String getType() {
        // TODO implement here
        return type;
    }


    public void setType(String type) {
        // TODO implement here
        this.type=type;
    }

    public String getFilter() {
        // TODO implement here
        return filter;
    }

    public void setFilter(String filter) {
        // TODO implement here
        this.filter=filter;
    }

    public Set<Item> getItems() {
        // TODO implement here
        return items;
    }

    public void setItems(Set<Item> Items) {
        // TODO implement here
       this.items=items;
    }

}