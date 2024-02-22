package park.operations;

import park.vehicle.Car;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import static park.operations.util.ParkOperationsUtil.*;

public class ParkOperations implements IParkOperations {

    public void enterIntoParking(List<Car> cars, Car carAdded){
        cars.add(carAdded);
        carAdded.setParkingTime(parkingTime());
        carAdded.park();
    }

    public void exitParking(List <Car> cars, int indexOfRemovedCar){
        int i=indexOfRemovedCar;
        System.out.println("The car with the registration number of: "+cars.get(i).getRegistationNo()+" was removed.");
        cars.remove(i);
    }

    public void pay(List<Car> cars,String registrationNo,String payment){
        LocalDateTime parkingTime = getCarParkingTime(registrationNo, cars);
        LocalDateTime unParkingTime = LocalDateTime.now();
        //TODO5: Update unparkingtime
        Duration durationOfParking = Duration.between(parkingTime, unParkingTime);

        long hours = durationOfParking.toHours();
        System.out.println("Time parked: "+hours);
        int valuePerHour = 10;
        if(hours-1 > 1){
            long price = (hours-1)*10;
            cars.get(index).setPayment(payment);
            removeParkedCar(index);
        } else {
            removeParkedCar(index);
        }

        //TODO6: Extract from 31 to 40 2 methods (calculate place in utility) Extract free hour in constant, in util package build another class with constants.
        //TODO7: https://www.tutorialspoint.com/log4j/log4j_sample_program.htm delete all the System.out.println and use Log4J
        //TODO8: LinkedList for raports
    }

}
