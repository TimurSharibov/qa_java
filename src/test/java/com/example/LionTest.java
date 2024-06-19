package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LionTest {

    @Test
    public void testGetKittens() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(2);

        Lion lion = new Lion("�����", feline);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void testDoesHaveManeForMale() throws Exception {
        Lion lion = new Lion("�����", new Feline());
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeForFemale() throws Exception {
        Lion lion = new Lion("�����", new Feline());
        assertTrue(!lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("������")).thenReturn(List.of("��������", "�����", "����"));

        Lion lion = new Lion("�����", feline);
        List<String> food = lion.getFood();
        assertTrue(food.contains("��������"));
        assertTrue(food.contains("�����"));
        assertTrue(food.contains("����"));
    }
}