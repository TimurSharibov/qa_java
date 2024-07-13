import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class CatTest {

    private final Feline feline = new Feline();

    @Test
    public void testGetFoodContainsAnimals() throws Exception {
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        System.out.println("Food list in test: " + food);  // Добавьте этот вывод для отладки
        assertTrue("The food list does not contain 'Животные'", food.contains("Животные"));
    }

    @Test
    public void testGetFoodSize() throws Exception {
        Cat cat = new Cat(feline);
        List<String> food = cat.getFood();
        assertEquals(3, food.size());
    }

    @Test
    public void testGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }
}
