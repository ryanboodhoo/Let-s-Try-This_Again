package Farmer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FarmHouseTest {
    @Test
    public void testAddResident() {
        FarmHouse farmHouse = new FarmHouse();
        Person person = new Person("I423","test person");
        farmHouse.addResident(person);

        assertEquals(1, farmHouse.getResidents().size());
        assertTrue(farmHouse.getResidents().contains(person));
    }
}
