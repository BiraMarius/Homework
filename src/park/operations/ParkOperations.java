package park.operations;

import park.vehicle.Car;
import park.vehicle.Vehiclee;

import java.util.List;

import static park.operations.util.ParkOperationsUtil.*;

public class ParkOperations implements IParkOperations {

    public void enterIntoParking(List<Car> cars, Car carAdded){
        cars.add(carAdded);
        carAdded.setParkingTime(parkingTime());
        carAdded.park();
        carAdded.setId(Vehiclee.getLastid());
    }

    public void exitParkingByIndex(List <Car> cars, int indexOfRemovedCar){
        int i=indexOfRemovedCar;
        System.out.println("The car with the registration number of: "+cars.get(i).getRegistationNo()+" was removed.");
        cars.remove(i);
    }

    public void exitParkingByOject(List <Car> cars, Car carAdded){
        System.out.println("The car with the registration number of: "+carAdded.getRegistationNo()+" was removed.");
        cars.remove(carAdded);
    }

/*
    public void pay(List<Car> cars,String registrationNo,String payment){
        LocalDateTime parkingTime = getCarParkingTime(registrationNo, cars);
        LocalDateTime unParkingTime = LocalDateTime.now();
        //TODO 5: Update unparkingtime
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

        TODO 6 Extract from 31 to 40 2 methods (calculate price in utility) Extract free hour in constant, in util package build another class with constants.
        TODO 7 https://www.tutorialspoint.com/log4j/log4j_sample_program.htm delete all the System.out.println and use Log4J
        TODO 8 LinkedList for raports

    }
*/

    public void A(List<Car> cars, int index){

        System.out.println(cars.get(index).getRegistationNo());
        System.out.println(cars.get(index).getId());

    }
}
