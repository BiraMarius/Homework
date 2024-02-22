import park.Park;
import park.vehicle.Car;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        // Rezolvare problema id, se creeaza 2 atribute, unul pentru a contoriza nr de masini si unul special pentru id
        Park promenadaParking = new Park();
        promenadaParking.addParkedCar(new Car("B001YAM"));
        promenadaParking.addParkedCar(new Car("B002YAM"));
        promenadaParking.addParkedCar(new Car("B003YAM"));
        promenadaParking.showParkedCars();
        System.out.println("park.vehicle.Car.getid>" + Car.getId());
        promenadaParking.pay("B001YAM","cash");
       // promenadaParking.pay("B003YAM","cash");
        promenadaParking.showParkedCars();
        System.out.println("park.vehicle.Car.getid>" +Car.getId());


//        promenadaParking.showParkedCars();
//        promenadaParking.removeParkedCar(0);
//        promenadaParking.showParkedCars();




        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Database.txt", true))) {
            writer.write("\n");
            System.out.println("Text written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

/*
{
  HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);

    In partea cars.add("////// aici se va parsa data si se va adauga nr de masini intrate in parcare"
 */