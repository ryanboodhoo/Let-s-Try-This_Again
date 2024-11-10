package Farmer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal;

    @BeforeEach
    public void setup() {
        // Creating an anonymous instance of Animal for testing
        animal = new Animal() {
            @Override
            public void makeNoise() {
                // Optional: Implement noise-making behavior for testing if needed
            }
        };
    }

    @Test
    void eat_increasesMealCount() {
        // Given
        Corn corn = new Corn(); // Assuming Corn is a subclass of Food

        // Arrange
        int initialMealCount = animal.getMealCount();

        // Act
        animal.eat(corn);

        // Assert
        assertEquals(initialMealCount + 1, animal.getMealCount(), "Meal count should increase by 1 after eating.");
    }

    @Test
    void eat_nullFoodDoesNotIncreaseMealCount() {
        // Arrange
        int initialMealCount = animal.getMealCount();

        // Act
        animal.eat(null);

        // Assert
        assertEquals(initialMealCount, animal.getMealCount(), "Meal count should not change when eating null food.");
    }

    @Test
    void getMealCount_initialValueIsZero(){}
}

