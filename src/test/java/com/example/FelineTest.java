package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("��������"));
        assertTrue(food.contains("�����"));
        assertTrue(food.contains("����"));
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("�������", feline.getFamily());
    }

    @Test
    public void testGetKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();
        assertEquals(3, feline.getKittens(3));
    }
}