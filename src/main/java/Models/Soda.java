package Models;

public class Soda {
    private String brand;
    private Integer flavor;
    private Integer size;
    private Integer quantity;
    private Float price;

    public Soda(String brand, Integer flavor, Integer size, Integer quantity, Float price) {
        this.brand = brand;
        this.flavor = flavor;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    public Soda() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFlavor() {
        return flavor;
    }

    public void setFlavor(Integer flavor) {
        this.flavor = flavor;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
