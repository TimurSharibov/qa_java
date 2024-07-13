import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LionTest {

    private final Feline feline = new Feline();

    @Test
    public void testGetFoodContainsAnimals() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        assertTrue("The food list does not contain 'Животные'", food.contains("Животные"));
    }

    @Test
    public void testGetFoodSize() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        assertEquals(3, food.size());
    }

    @Test
    public void testDoesHaveManeForMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testDoesNotHaveManeForFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertTrue(!lion.doesHaveMane());
    }
}
