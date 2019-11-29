package Models;

public class Candy {

    private String brand;
    private Integer quantity;
    private Float price;


    public Candy(String brand, Integer quantity, Float price) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    public Candy() {
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
