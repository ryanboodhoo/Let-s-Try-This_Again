package Farmer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testVehicles(){
        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();
        assertTrue(tractor instanceof Vehicle);
        assertTrue(cropDuster instanceof Vehicle);
    }



}