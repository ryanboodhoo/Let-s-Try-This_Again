package Farmer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ReflectionUtils;

import static org.junit.jupiter.api.Assertions.*;

class TractorTest {
    Tractor tractor;

    @Test
    void testHarvest() {
        CropRow cropRow = new CropRow();

        //Can tractor harvest?
        Tractor.harvest(cropRow);
    }
}