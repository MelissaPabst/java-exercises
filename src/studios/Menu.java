package studios;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastModified;
    private ArrayList<MenuItem> items;
    private String category;

    public Date getLastModified() {
        return lastModified;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public String getCategory() {
        return category;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
