package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AnimalTest {

    @Test
    public void testGetFoodHerbivoreContainsGrass() {
        Animal animal = new Animal();
        try {
            List<String> food = animal.getFood("Травоядное");
            assertTrue(food.contains("Трава"));
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testGetFoodHerbivoreContainsVariousPlants() {
        Animal animal = new Animal();
        try {
            List<String> food = animal.getFood("Травоядное");
            assertTrue(food.contains("Различные растения"));
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testGetFoodPredatorContainsAnimals() {
        Animal animal = new Animal();
        try {
            List<String> food = animal.getFood("Хищник");
            assertTrue(food.contains("Животные"));
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testGetFoodPredatorContainsBirds() {
        Animal animal = new Animal();
        try {
            List<String> food = animal.getFood("Хищник");
            assertTrue(food.contains("Птицы"));
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testGetFoodPredatorContainsFish() {
        Animal animal = new Animal();
        try {
            List<String> food = animal.getFood("Хищник");
            assertTrue(food.contains("Рыба"));
        } catch (Exception e) {
            fail("Unexpected exception thrown");
        }
    }

    @Test
    public void testGetFoodUnknownTypeThrowsException() {
        Animal animal = new Animal();
        try {
            animal.getFood("Неизвестный тип");
            fail("Expected exception not thrown");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
