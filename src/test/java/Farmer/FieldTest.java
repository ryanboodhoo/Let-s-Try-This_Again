package Farmer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {
    @Test
    public void testAddCropRow() {
        Field field = new Field();
        CropRow cropRow = new CropRow();
        field.addCropRow(cropRow);

        assertEquals(1, field.getCropRows().size());
        assertTrue(field.getCropRows().contains(cropRow));
    }
}
