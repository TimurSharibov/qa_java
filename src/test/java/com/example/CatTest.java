package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CatTest {

    @Test
    public void testGetSound() {
        Cat cat = new Cat(new Feline());
        assertEquals("ћ€у", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("∆ивотные", "ѕтицы", "–ыба"));

        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        assertTrue(food.contains("∆ивотные"));
        assertTrue(food.contains("ѕтицы"));
        assertTrue(food.contains("–ыба"));
    }
}