import com.example.AlexLion;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexLionTest {

    private final Feline feline = new Feline();

    @Test
    public void testGetFriendsContainsMarty() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        List<String> friends = alexLion.getFriends();
        assertTrue("The friends list does not contain 'Марти'", friends.contains("Марти"));
    }

    @Test
    public void testGetFriendsSize() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        List<String> friends = alexLion.getFriends();
        assertEquals(3, friends.size());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertEquals(0, alexLion.getKittens());
    }
}
