package Farmer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChickenCoopTest {
    @Test
    public void testAddChicken() {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chicken = new Chicken(false);
        chickenCoop.addChicken(chicken);

        assertEquals(1, chickenCoop.getChickens().size());
        assertTrue(chickenCoop.getChickens().contains(chicken));
    }
}
