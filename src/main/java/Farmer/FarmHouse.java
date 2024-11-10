package Farmer;
import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List<Person> residents;

    public FarmHouse() {
        this.residents = new ArrayList<>();
    }

    public void addResident(Person person) {
        residents.add(person);
    }

    public List<Person> getResidents() {
        return residents;
    }
}
