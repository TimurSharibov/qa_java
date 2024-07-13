import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CatTest {

    private Feline feline = new Feline();

    @Test
    public void testGetFoodContainsAnimals() throws Exception {
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        assertTrue(food.contains("Животные"));
    }

    @Test
    public void testGetFoodSize() throws Exception {
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        assertEquals(3, food.size());  // Предположим, что кошка ест три типа пищи
    }
}
