package Farmer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CropDusterTest {

    @Test
    void testFertilize() {
        CropRow cropRow = new CropRow();

        //Can crop duster fertilize?
        CropDuster.fertilize(cropRow);
    }
}