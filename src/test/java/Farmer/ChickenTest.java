package Farmer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ChickenTest {
    private Chicken chicken;

    @BeforeEach
    public void setup() {
        chicken = new Chicken(true);
    }

    @Test
    void laidEgg() {
        // Given: a chicken that can lay an egg
        Chicken chicken = new Chicken(true);

        // When: the chicken lays an egg
        Egg egg = chicken.laidEgg();

        // Then: an egg should be created successfully
        assertNotNull(egg, "Chicken should lay an egg successfully");
    }

    public void eat() {
        Edible feed = new Cornstalk(true, true); // Assume `Cornstalk` is an `Edible` item
        boolean canEat = chicken.eat(feed);


    }
}