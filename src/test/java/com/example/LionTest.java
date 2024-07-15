package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void testGetFood() {
        Feline mockFeline = mock(Feline.class);
        Lion lion = null;
        try {
            lion = new Lion("Самец", mockFeline);
            List<String> food = List.of("Животные", "Птицы", "Рыба");
            when(mockFeline.getFood("Хищник")).thenReturn(food);
            assertEquals(food, lion.getFood());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDoesHaveManeForMale() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion("Самец", mockFeline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testDoesNotHaveManeForFemale() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion("Самка", mockFeline);
        assertTrue(!lion.doesHaveMane());
    }

    @Test
    public void testGetKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(3); // Пример возвращаемого значения для mockFeline.getKittens()

        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(3, lion.getKittens());
    }
}
