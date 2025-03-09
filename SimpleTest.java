import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    public void testSum() {
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should be 5");
    }
}
