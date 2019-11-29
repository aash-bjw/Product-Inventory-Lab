package Models;

public class Soda {
    private String brand;
    private String  flavor;
    private Double size;
    private Integer quantity;
    private Double price;
    private Integer id;

    public Soda(String brand, String flavor, Double size, Integer quantity, Double price, Integer id) {
        this.brand = brand;
        this.flavor = flavor;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    public Soda() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
