package Services;

import Models.Soda;

import java.util.ArrayList;

public class SodaService {
    private static int nextId = 1;
    private ArrayList<Soda> inventory = new ArrayList<>();

    public Soda create(String brand, String flavor, Double size, Integer quantity, Double price) {
        Soda createdSoda = new Soda(brand, flavor, size, quantity, price, nextId++);
        inventory.add(createdSoda);
        return createdSoda;
    }

    public Soda findSoda(Integer id) {
        for (Soda s : inventory) {
            if (id.equals(s.getId())) {
                return s;
            }
        }
        return null;
    }

    public Soda[] findAll() {

        return inventory.toArray(new Soda[0]);
    }

    public Boolean delete(Integer id) {
        if (inventory.contains(findSoda(id)))
            inventory.remove(findSoda(id));
        return true;
    }
}
