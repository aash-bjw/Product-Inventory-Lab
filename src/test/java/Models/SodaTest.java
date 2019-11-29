package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SodaTest {

    @Test
    public void constructorTest(){
        String expectedBrand = "Coca-Cola";
        String expectedFlavor = "Original";
        Double expectedSize = 16.9;
        Integer expectedQuantity = 2;
        Double expectedPrice = 1.99;
        Integer expectedId = 1;

        Soda soda = new Soda(expectedBrand, expectedFlavor, expectedSize, expectedQuantity, expectedPrice,expectedId);

        Assertions.assertEquals(expectedBrand, soda.getBrand());
        Assertions.assertEquals(expectedFlavor, soda.getFlavor());
        Assertions.assertEquals(expectedSize, soda.getSize());
        Assertions.assertEquals(expectedQuantity, soda.getQuantity());
        Assertions.assertEquals(expectedPrice, soda.getPrice());
        Assertions.assertEquals(expectedId, soda.getId());

    }

    @Test
    void setBrand() {
        String expected = "Sprite";
        Soda testSoda = new Soda();
        testSoda.setBrand(expected);

        Assertions.assertEquals(expected, testSoda.getBrand());
    }

    @Test
    void setFlavor() {
        String expected = "remix";
        Soda testSoda = new Soda();
        testSoda.setFlavor(expected);

        Assertions.assertEquals(expected, testSoda.getFlavor());
    }

    @Test
    void setSize() {
        Double expected = 16.9;
        Soda testSoda = new Soda();
        testSoda.setSize(expected);

        Assertions.assertEquals(expected, testSoda.getSize());
    }

    @Test
    void setQuantity() {
        Integer expected = 2;
        Soda testSoda = new Soda();
        testSoda.setQuantity(expected);

        Assertions.assertEquals(expected, testSoda.getQuantity());
    }

    @Test
    void setPrice() {
        Double expected = 1.99;
        Soda testSoda = new Soda();
        testSoda.setPrice(expected);

        Assertions.assertEquals(expected, testSoda.getPrice());
        }

        @Test
    void setId(){
        Integer expected = 1;
        Soda testSoda = new Soda();
        testSoda.setId(expected);

        Assertions.assertEquals(expected, testSoda.getId());
        }
}
