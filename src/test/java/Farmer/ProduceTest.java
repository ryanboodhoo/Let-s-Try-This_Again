package Farmer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduceTest {

    @Test
    void yield() {
        // Arrange
        Produce produce = new Produce() {
            @Override
            public Egg yield() {
                return new Egg();
            }
        };

        // Act
        Egg result = produce.yield();

        // Assert
        assertNotNull(result, "The yield method should return a Corn instance, but it returned null.");
    }
}
