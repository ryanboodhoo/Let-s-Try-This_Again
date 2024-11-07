package Farmer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test cases to verify the behavior of the Botanist interface.
public class BotanistTest {

    @Test
    public void testBotanistCanPlantCropInCropRow() {
        // Given
        Person person = new Person("1", "Froilan"); // A new Person instance
        CropRow cropRow = new CropRow(); // A new CropRow instance
        Crop crop = new Crop(); // A new Crop object

        // When
        ((Botanist) person).plant(cropRow, crop); // Cast Person to Botanist and plant crop in CropRow

        // Then
        assertTrue(cropRow.getCrops().contains(crop)); // Verify the crop is in the CropRow
    }
}
