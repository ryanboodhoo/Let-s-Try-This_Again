package Farmer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test cases to verify the behavior of the Rider interface.
public class RiderTest {

    @Test
    public void testRiderCanMountAndDismount() {
        // Given
        Person person = new Person("1", "Froilan"); // A new Person instance
        Rideable rideable = new Rideable() {
            @Override
            public void canRide() {

            }
        }; // Anonymous Rideable instance for testing

        // When
        person.mount(rideable); // Person mounts the Rideable
        person.dismount(rideable); // Person dismounts the Rideable

        // Then
        // No exception should be thrown, so this is considered successful if no error occurs.
    }
}
