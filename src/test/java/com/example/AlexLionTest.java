package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexLionTest {

    @Test
    public void testGetFriends() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        List<String> friends = alexLion.getFriends();
        assertTrue(friends.contains("Марти"));
        assertTrue(friends.contains("Глория"));
        assertTrue(friends.contains("Мелман"));
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        assertEquals(0, alexLion.getKittens());
    }
}