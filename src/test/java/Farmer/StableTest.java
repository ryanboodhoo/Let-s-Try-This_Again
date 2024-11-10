package Farmer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StableTest {
    @Test
    public void testAddHorse() {
        Stable stable = new Stable();
        Horse horse = new Horse();
        stable.addHorse(horse);

        assertEquals(1, stable.getHorses().size());
        assertTrue(stable.getHorses().contains(horse));
    }
}
