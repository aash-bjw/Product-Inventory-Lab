package Services;
import Models.Soda;

import java.util.ArrayList;

public class SodaService {
    private static int nextId = 1;
    private ArrayList<Soda> inventory = new ArrayList<>();

    public Soda create(String brand, String flavor, Double size, Integer quantity, Double price){
        Soda createdSoda = new Soda(brand, flavor, size, quantity, price, nextId++);
        inventory.add(createdSoda);
        return createdSoda;
    }

    public Soda findCandy(Integer id){
        return null;
    }

    public Soda[] findAll(){
        return null;
    }

    public Boolean delete(Integer id){
        return false;
    }
}
