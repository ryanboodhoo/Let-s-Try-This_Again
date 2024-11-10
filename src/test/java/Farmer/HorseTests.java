package Farmer;

import Farmer.Cornstalk;
import Farmer.Edible;
import Farmer.Horse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HorseTests {

    private Horse horse;

    @BeforeEach
    public void setup() {
        horse = new Horse();
    }

    @Test
    void testCanBeRidden() {
        // Test if the horse can be ridden
        assertTrue(horse.canBeRidden(), "Horse should be able to be ridden");
    }

    @Test
    public void testHorseCanBeFed() {
        Edible feed = new Cornstalk(true, true); // Assume `Cornstalk` is an `Edible` item
        boolean canEat = horse.eat(feed);

        assertTrue(canEat, "Horse should be able to eat the feed");
    }

    @Test
    public void testHorseCanBeRidden() {
        boolean canRide = horse.ride();

        assertTrue(canRide, "Horse should be able to be ridden");
    }
}
