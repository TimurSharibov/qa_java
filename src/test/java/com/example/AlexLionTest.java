import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import com.example.*;


public class AlexLionTest {

    @Test
    public void testGetFriendsContainsMarty() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        List<String> friends = alexLion.getFriends();
        assertTrue(friends.contains("Марти"));
    }

    @Test
    public void testGetFriendsSize() throws Exception {
        AlexLion alexLion = new AlexLion(new Feline());
        List<String> friends = alexLion.getFriends();
        assertEquals(3, friends.size());  // Предположим, что у AlexLion три друга
    }
}
