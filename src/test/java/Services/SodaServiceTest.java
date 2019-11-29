package Services;

import Models.Soda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SodaServiceTest {

    @Test
    public void createTest(){
        String expectedBrand = "Coca-Cola";
        String expectedFlavor = "Original";
        Double expectedSize = 16.9;
        Integer expectedQuantity = 2;
        Double expectedPrice = 1.99;
        Integer expectedId = 1;

        SodaService sodaService = new SodaService();
        Soda soda = new Soda(expectedBrand, expectedFlavor, expectedSize, expectedQuantity, expectedPrice,expectedId);

        String actualBrand = soda.getBrand();
        String actualFlavor = soda.getFlavor();
        Double actualSize = soda.getSize();
        Integer actualQuantity = soda.getQuantity();
        Double actualPrice = soda.getPrice();
        Integer actualId = soda.getId();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedFlavor, actualFlavor);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQuantity, actualQuantity);
        Assertions.assertEquals(expectedPrice, actualPrice);
        Assertions.assertEquals(expectedId, actualId);
    }

    @Test
    public void findSoda() {
        String expectedBrand = "Coca-Cola";
        String expectedFlavor = "Original";
        Double expectedSize = 16.9;
        Integer expectedQuantity = 2;
        Double expectedPrice = 1.99;
        Integer expectedId = 1;

        SodaService sodaService = new SodaService();
        Soda soda = sodaService.create(expectedBrand, expectedFlavor, expectedSize, expectedQuantity, expectedPrice);

        Soda actual = sodaService.findSoda(1);
        assertEquals(actual, soda);

    }

        @Test
    public void deleteSoda() {
        ArrayList<Soda> inventory = new ArrayList<>();
        Soda s1 = new Soda();
        Soda s2 = new Soda();
        Soda s3 = new Soda();
        inventory.add(s1);
        inventory.add(s2);
        inventory.add(s3);
        inventory.remove(s2);

        Boolean expected = inventory.contains(s2);

        Assertions.assertFalse(expected);
    }
}
