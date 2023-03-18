package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {

    String name;
    Long id;
    Double price;

    public Item() {
        id = 0L;
        name = "";
        price = 0.01;
    }

    public Item(Long id, String name, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
