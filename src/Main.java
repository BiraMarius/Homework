import park.Park;
import park.vehicle.Car;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;




public class Main {
    public static void main(String[] args) {

        // Rezolvare problema id, se creeaza 2 atribute, unul pentru a contoriza nr de masini si unul special pentru id
//        Park promenadaParking = new Park();
//        promenadaParking.addParkedCar(new Car("B001YAM"));
//        promenadaParking.addParkedCar(new Car("B002YAM"));
//        promenadaParking.addParkedCar(new Car("B003YAM"));
//        promenadaParking.showParkedCars();
//        System.out.println("park.vehicle.Car.getid>" + Car.getId());
//        promenadaParking.pay("B001YAM","cash");
       // promenadaParking.pay("B003YAM","cash");
//        promenadaParking.showParkedCars();
//        System.out.println("park.vehicle.Car.getid>" +Car.getId());


//        promenadaParking.showParkedCars();
//        promenadaParking.removeParkedCar(0);
//        promenadaParking.showParkedCars();




//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Database.txt", true))) {
//            writer.write("\n");
//            System.out.println("Text written to file.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Park promenadaParking = new Park();
        promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B01YAM"));
        promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B02YAM"));
        promenadaParking.showCars(promenadaParking.getCars());
        promenadaParking.exitP2(promenadaParking.getCars(),new Car("B01YAM"));
        promenadaParking.showCars(promenadaParking.getCars());
        promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B03YAM"));

        // Fix the id problem



    }
}

