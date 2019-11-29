package Models;

public class Candy {

    private String brand;
    private Integer quantity;
    private Double price;
    private Integer id;


    public Candy(String brand, Integer quantity, Double price, Integer id) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
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
