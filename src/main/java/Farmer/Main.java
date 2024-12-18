package Farmer;

public class Main {
    public static void main(String[] args) {

        Person froilan = new Person("01", "Froilan");
        Person froilanda = new Person("02", "Froilanda");

        Horse horse1 = new Horse("runner");
        Horse horse2 = new Horse("daisy");
        Horse horse3 = new Horse("blaze");

        Stable stable1 = new Stable();
        stable1.addHorse(horse1);
        stable1.addHorse(horse2);
        stable1.addHorse(horse3);

        stable1.getHorses();

        CropRow cropRow1 = new CropRow();
        CropRow cropRow2 = new CropRow();
        CropRow cropRow3 = new CropRow();

        Corn corn = new Corn();

        for (int day = 1; day <= 7; day++) {
            System.out.println("\n--- Day " + day + " ---");

            rideHorses(froilan, stable1);
            rideHorses(froilanda, stable1);

            feedHorses(froilan, stable1);
            feedHorses(froilanda, stable1);

            breakfast(froilan);
            breakfast(froilanda);

            if (day == 1) {
                sundayRoutine(froilan, cropRow1, cropRow2, cropRow3);
            } else if (day == 2) {
                mondayRoutine(froilanda);
            } else if (day == 3) {
                tuesdayRoutine(froilan);
            }
        }
    }


    private static void rideHorses(Person person, Stable stable1) {
        System.out.println(person + " is riding all the horses.");
        for (Horse horse : stable1.getHorses()) {
            person.mount(horse);
            horse.ride(person);
            System.out.println();
        }
    }

    private static void feedHorses(Person person, Stable stable1) {
        System.out.println(person + " is feeding the horses.");
        for (Horse horse : stable1.getHorses()) {

            horse.eat(new Corn());

        }
        System.out.println();
    }

    private static void breakfast(Person person) {
        System.out.println(person + " is having breakfast.");
        person.eat(new Corn());
        person.eat(new Tomato());
        person.eat(new Egg());
        System.out.println();
    }

    private static void sundayRoutine(Person froilan, CropRow cropRow1, CropRow cropRow2, CropRow cropRow3) {
        System.out.println("Froilan is planting crops in the fields.");
        froilan.plant(cropRow1, new Cornstalk(false, false));
        froilan.plant(cropRow2, new TomatoPlant(false, false));
        froilan.plant(cropRow3, new Cornstalk(false, false));
        System.out.println();
    }

    private static void mondayRoutine(Person froilanda) {
        System.out.println("Froilanda is fertilizing crops with Crop Duster.");
        CropDuster cropDuster = new CropDuster();
        cropDuster.fertilize(new CropRow());
        cropDuster.fertilize(new CropRow());
        cropDuster.fertilize(new CropRow());
        System.out.println();
    }

    private static void tuesdayRoutine(Person froilan) {
        System.out.println("Froilan is harvesting crops with the Tractor.");
        Tractor tractor = new Tractor();
        tractor.harvest(new CropRow());
        tractor.harvest(new CropRow());
        tractor.harvest(new CropRow());
        System.out.println();
    }
}