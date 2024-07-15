package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class FelineTest {

    @Test
    public void testGetFoodPredator() {
        Feline feline = new Feline();
        try {
            List<String> food = feline.getFood("Хищник");
            assertTrue(food.contains("Животные"));
            assertTrue(food.contains("Птицы"));
            assertTrue(food.contains("Рыба"));
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testGetFoodUnknownType() {
        Feline feline = new Feline();
        try {
            feline.getFood("Травоядное");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Хищник", e.getMessage());
        }
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
