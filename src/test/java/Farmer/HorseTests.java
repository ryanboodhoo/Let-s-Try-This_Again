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
    public void testHorseCanEat() {

        Edible feed = new Cornstalk(true, true);

        horse.eat(feed);


    }

    @Test
    public void testHorseCanBeRidden() {
       Person person1 = new Person("01" , "Ryan");
        boolean canRide = horse.ride(person1);

        assertTrue(canRide, "Horse should be able to be ridden");
    }
}
