package Farmer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test cases to verify the behavior of the Farm class.
public class FarmTest {

    @Test
    public void testFarmCanStoreStablesAndChickenCoopsAndFarmHouse() {
        // Given
        Farm farm = new Farm(); // A new Farm instance
        Stable stable = new Stable(); // A new Stable instance
        ChickenCoop chickenCoop = new ChickenCoop(); // A new ChickenCoop instance
        FarmHouse farmHouse = new FarmHouse(); // A new FarmHouse instance

        // When
        farm.addStable(stable); // Add the Stable to the Farm
        farm.addChickenCoop(chickenCoop); // Add the ChickenCoop to the Farm
        farm.setFarmHouse(farmHouse); // Set the FarmHouse in the Farm

        // Then
        assertTrue(farm.getStables().contains(stable)); // Verify the Stable is stored in the Farm
        assertTrue(farm.getChickenCoops().contains(chickenCoop)); // Verify the ChickenCoop is stored in the Farm
        assertEquals(farmHouse, farm.getFarmHouse()); // Verify the FarmHouse is correctly set in the Farm
    }
}
