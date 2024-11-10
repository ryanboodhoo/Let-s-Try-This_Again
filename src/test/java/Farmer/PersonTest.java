package Farmer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Test cases to verify the behavior of the Person class.
public class PersonTest {

    @Test
    public void testPersonCanEatEdible() {
        // Given
        Person person = new Person("1", "Froilan"); // A new Person instance
        Edible edible = new Edible() {
        }; // Anonymous implementation of Edible for testing

        // When
        person.eat(edible); // Person eats the Edible

        // Then
        // No exception should be thrown, so this is considered successful if no error occurs.
    }

    @Test
    public void testPersonCanMakeNoise() {
        // Given
        Person person = new Person("1", "Froilan"); // A new Person instance

        // When
        person.makeNoise(); //
    }
}