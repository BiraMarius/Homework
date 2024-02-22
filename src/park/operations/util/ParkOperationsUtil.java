package park.operations.util;

import park.vehicle.Car;

import java.time.LocalDateTime;
import java.util.List;

public class ParkOperationsUtil extends Object{
    public static LocalDateTime parkingTime(){
        LocalDateTime parkingTime = LocalDateTime.now();
        return parkingTime;
    }

    public static LocalDateTime unParkingTime(){
        LocalDateTime unParkingTime = LocalDateTime.now();
        return unParkingTime;
    }

    public static void showParkedCars(){
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

    public static LocalDateTime getCarParkingTime(String registrationNo, List<Car> cars){
        Car car = findCarObjByPlate(registrationNo, cars);
        if(car != null){
            return car.getParkingTime();
        }
        return null;
        //TODO3 : Rewrite with turner if
    }

    private static Car validateAndGetNumber(String registrationNo, Car car) {
        if(car.getRegistationNo()!=null){
            if(car.getRegistationNo().equalsIgnoreCase(registrationNo)){
                return car;
            }
        }
        return null;
        //TODO4 : Rewrite with turner if
    }


}
