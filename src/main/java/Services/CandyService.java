package Services;

import Models.Candy;

import java.util.ArrayList;

public class CandyService {
    private static int nextId = 1;
    private ArrayList<Candy> inventory = new ArrayList<>();

    public Candy create(String brand, Integer quantity, Double price){
        Candy createdCandy = new Candy(brand, quantity, price, nextId++);
        inventory.add(createdCandy);
        return createdCandy;
    }

    public Candy findCandy(Integer id){
        return null;
    }

    public Candy[] findAll(){
        return null;
    }

    public Boolean delete(Integer id){
        return false;
    }
}
