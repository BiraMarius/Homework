import park.Park;
import park.vehicle.Car;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
        Park BaneasaP = new Park();
        Scanner sc = new Scanner(System.in);
        int startStop = 0;
        String carRN;
        System.out.println("1 - Add \n" +
                "            2 - Pay cash \n" +
                "            3 - Pay card \n" +
                "            4 - Report of the day \n" +
                "            5 - Save report to bd \n" +
                "            6 - EXIT \n" +
                "            7 - List \n");

        while(startStop != 1){
            String option = sc.nextLine();
            int intoption = Integer.valueOf(option);
            switch(intoption){

                case 1: //Adding car to the parking
                        System.out.println("Please enter car registration number: ");
                        carRN = sc.nextLine();
                        BaneasaP.enter(new Car(carRN));
                        break;

                case 2: //Cash payment
                        System.out.println("Please enter car registration number for payment: ");
                        carRN = sc.nextLine();
                        BaneasaP.pay(carRN,"CASH");
                        break;

                case 3: //Card payment
                        System.out.println("Please enter car registration number for payment: ");
                        carRN = sc.nextLine();
                        BaneasaP.pay(carRN,"CARD");
                        break;

                case 4: //Show report of the day
                        System.out.println("Report for today till this time.");
                        BaneasaP.showReport();
                        break;

                case 5: //save report
                        break;

                case 6: System.out.println("Shuting down.");
                        startStop=1;
                        break;

                case 7: //Show all parked cars.
                        //BaneasaP.showParkedCars();
                        BaneasaP.showPc();
                        break;
            }
        }



    }
//    public LocalDateTime timeFormatter(LocalDateTime time){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        DateTimeFormatter formattedTime = time.format(formatter);
//        return formattedTime;
//    }




}

