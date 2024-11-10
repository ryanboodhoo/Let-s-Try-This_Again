package Farmer;
import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<CropRow> cropRows;

    public Field() {
        this.cropRows = new ArrayList<>();
    }

    public void addCropRow(CropRow cropRow) {
        cropRows.add(cropRow);
    }

    public List<CropRow> getCropRows() {
        return cropRows;
    }
}
