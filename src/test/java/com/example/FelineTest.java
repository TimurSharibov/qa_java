import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class FelineTest {

    @Test
    public void testEatMeatContainsAnimals() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные"));
    }

    @Test
    public void testEatMeatSize() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals(3, food.size());  // Предположим, что Feline ест три типа пищи
    }
}
