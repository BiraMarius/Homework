import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Testing Car class and objects
        //Car masina1 = new Car("B800YAM","20:33","13-FEB-2024");
        //masina1.park();
        //End of Testing


        Park promenadaParking = new Park();
        promenadaParking.addParkedCar(new Car("B800YAM"));
        promenadaParking.showParkedCars();
        promenadaParking.pay("B800YAM","cash");
       // promenadaParking.payParking(0,"cash");
//        promenadaParking.payParking(2,"card");
//        promenadaParking.showParkedCars();
//        promenadaParking.removeParkedCar(0);
//        promenadaParking.showParkedCars();

    }
}