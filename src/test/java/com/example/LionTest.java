import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class LionTest {

    private Feline feline = new Feline();

    @Test
    public void testGetFoodContainsAnimals() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        assertTrue(food.contains("Животные"));
    }

    @Test
    public void testGetFoodSize() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> food = lion.getFood();
        assertEquals(3, food.size());  // Предположим, что лев ест три типа пищи
    }
}
