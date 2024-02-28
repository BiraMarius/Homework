package park.operations.util;

import park.vehicle.Car;
import park.operations.util.Constants;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class ParkOperationsUtil extends Object{

    public static void showParkedCars(List <Car> cars){
        for(int i=0; i<=cars.size()-1;i++){
            cars.get(i).details();
        }
    }

    public static int findIndexByPlate(String registrationNo, List<Car> cars){
        for(int i=0; i<cars.size(); i++){
            if(cars.get(i).getRegistationNo() == registrationNo){
                return i;
            }
        }
        return -1;
    }

    public static Car findCarObjByPlate(String registrationNo, List<Car> cars){
        for(int i=0; i<cars.size(); i++){
            return validateAndGetNumber(registrationNo, cars.get(i));
        }
        return null;
    }

    /* Time function without ternary operator / short handed if

    public static LocalDateTime getCarParkingTime(String registrationNo, List<Car> cars){
        Car car = findCarObjByPlate(registrationNo, cars);
        if(car != null){
            return car.getParkingTime();
        }
        return null;
    }
     */

    public static LocalDateTime getCarParkingTime(String registrationNumber, List<Car> cars){
        Car car = findCarObjByPlate(registrationNumber, cars);
        return  (car!=null) ? car.getParkingTime() : null;
    }

    /* validate function without ternary operator / short handed if
    private static Car validateAndGetNumber(String registrationNo, Car car) {
        if(car.getRegistationNo()!=null){
            if(car.getRegistationNo().equalsIgnoreCase(registrationNo)){
                return car;
            }
        }
        return null;
    }
     */

    private static Car validateAndGetNumber(String registrationNo, Car car) {
        return (car.getRegistationNo() != null && car.getRegistationNo().equalsIgnoreCase(registrationNo))
                ? car
                : null;
    }

    public static int duration(List<Car> cars, Car car){
        LocalDateTime parkingTime = car.getParkingTime();
        LocalDateTime unParkingTime = LocalDateTime.now();
        Duration durationOfParking = Duration.between(parkingTime, unParkingTime);
        int duration = (int) durationOfParking.toHours();
        return duration;

//        Duration durationOfParking = Duration.between(parkingTime, unParkingTime);
//        long hours = durationOfParking.toHours();
//        System.out.println("Time parked: "+hours);
//        int valuePerHour = 10;
    }

    public static int priceCalculator(int hours){
        hours = hours-(Constants.freeHour);
        int price=0;
        return (hours>1) ?  price = hours*(Constants.valuePerHour) : price;
//        if(hours-1 > 1){
//            long price = (hours-1)*10;
//            //cars.get(index).setPayment(payment);
//            removeParkedCar(index);
//        } else {
//            removeParkedCar(index);
//        }
    }

}
