import park.Park;
import park.vehicle.Car;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static park.operations.util.ParkOperationsUtil.findIndexByPlate;


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

//        Park promenadaParking = new Park();
//        promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B01YAM"));
//        Car car1 = new Car("TESTP2");
//        promenadaParking.enterIntoParking(promenadaParking.getCars(),car1);

        //promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B02YAM"));
        //promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B03YAM"));
        //promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B04YAM"));
//        promenadaParking.showCars(promenadaParking.getCars());
//        promenadaParking.exitP2(promenadaParking.getCars(),car1);
        //promenadaParking.exitParking(promenadaParking.getCars(),findIndexByPlate("B01YAM",promenadaParking.getCars()));

        //promenadaParking.enterIntoParking(promenadaParking.getCars(), new Car("B05YAM"));
//        promenadaParking.showCars(promenadaParking.getCars());

        //promenadaParking.A(promenadaParking.getCars(),0);

        // Fix the id problem

        String dateTimeString = "2024-03-01 12:30:45";

        // Define a DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Parse the String into a LocalDateTime
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);

        // Print the parsed date-time
        System.out.println("Parsed LocalDateTime: " + parsedDateTime);



    }
//    public LocalDateTime timeFormatter(LocalDateTime time){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter formattedTime = time.format(formatter);
//        return formattedTime;
//    }

}

