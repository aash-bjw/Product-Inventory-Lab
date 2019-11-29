package Services;

import Models.Candy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CandyServiceTest {

    @Test
    public void createTest() {
        String expectedBrand = "Skittles";
        Integer expectedQuantity = 2;
        Double expectedPrice = 1.99;
        Integer expectedId = 1;

        CandyService candyService = new CandyService();
        Candy candy = new Candy(expectedBrand, expectedQuantity, expectedPrice, expectedId);

        String actualBrand = candy.getBrand();
        Integer actualQuantity = candy.getQuantity();
        Double actualPrice = candy.getPrice();
        Integer actualId = candy.getId();

        assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        assertEquals(expectedBrand, actualBrand);
        assertEquals(expectedQuantity, actualQuantity);
        assertEquals(expectedPrice, actualPrice);
        assertEquals(expectedId, actualId);

    }

    @Test
    public void findCandy() {
        String expectedBrand = "Skittles";
        Integer expectedQuantity = 2;
        Double expectedPrice = 1.99;

        CandyService candyService = new CandyService();
        Candy candy = candyService.create(expectedBrand, expectedQuantity, expectedPrice);

        Candy actual = candyService.findCandy(1);
        assertEquals(actual, candy);

    }

    @Test
    public void deleteCandy() {
        ArrayList<Candy> inventory = new ArrayList<>();
        Candy c1 = new Candy();
        Candy c2 = new Candy();
        Candy c3 = new Candy();
        inventory.add(c1);
        inventory.add(c2);
        inventory.add(c3);
        inventory.remove(c2);

        Boolean expected = inventory.contains(c2);

        Assertions.assertFalse(expected);
    }
}
