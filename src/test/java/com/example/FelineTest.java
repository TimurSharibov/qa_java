import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FelineTest {

    @Test
    public void testEatMeatContainsAnimals() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");
        assertTrue("The food list does not contain 'Животные'", food.contains("Животные"));
    }

    @Test
    public void testEatMeatSize() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.getFood("Хищник");
        assertEquals(3, food.size());
    }
}
