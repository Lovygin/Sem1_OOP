package Domen;

public class Product {
    private long id;
    private String name;
    private int price;
    private int place;

    public Product(int price, int place, String name, long id) {
        this(price, place, name);
        this.name = name;
    }

    public Product() {
        this.id = -1;
        this.name = "unknown";
        this.price = -1;
        this.place = -1;
    }

    public Product(int price) {
        this();
        this.price = price;
    }

    public Product(int price, int place) {
        this(price);
        this.place = place;
    }

    public Product(int price, int place, String name) {
        this(price, place);
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "\nName = " + this.name + "\n" +
                "Price = " + this.price + "\n"+
                "Place = " + this.place + "\n" +
                "ID = " + this.id + "\n";
    }
}
