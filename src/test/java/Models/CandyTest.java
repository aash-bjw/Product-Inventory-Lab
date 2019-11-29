package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class CandyTest {

    @Test
    public void constructorTest(){
    String expectedBrand = "Skittles";
    Integer expectedQuantity = 2;
    Double expectedPrice = 1.99;
    Integer expectedId = 1;

    Candy candy = new Candy(expectedBrand, expectedQuantity, expectedPrice, expectedId);

    Assertions.assertEquals(expectedBrand, candy.getBrand());
    Assertions.assertEquals(expectedQuantity, candy.getQuantity());
    Assertions.assertEquals(expectedPrice, candy.getPrice());
    Assertions.assertEquals(expectedId, candy.getId());

    }


    @Test
    void setBrand() {
        String expected = "Twix";
        Candy testCandy = new Candy();
        testCandy.setBrand(expected);

        Assertions.assertEquals(expected, testCandy.getBrand());
    }

    @Test
    void setQuantity() {
        Integer expected = 3;
        Candy testCandy = new Candy();
        testCandy.setQuantity(expected);

        Assertions.assertEquals(expected, testCandy.getQuantity());
    }

    @Test
    void setPrice() {
        Double expected = .99;
        Candy testCandy = new Candy();
        testCandy.setPrice(expected);

        Assertions.assertEquals(expected, testCandy.getPrice());
    }

    @Test
    void setId(){
        Integer expected = 1;
        Candy testCandy = new Candy();
        testCandy.setId(expected);

        Assertions.assertEquals(expected, testCandy.getId());
    }
}
