package park;

import park.operations.ParkOperations;
import park.vehicle.Car;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Park extends ParkOperations {
    private List<Car> cars = new ArrayList<>();
    //private Set<String> reports = new HashSet<String>();
    //private Set<Report> reports = new HashSet<>();

    public void enter(Car car){
        super.enterIntoParking(cars, car);
    }



    public List<Car> getCars() {
        return cars;
    }

    public int listSize(){
        return cars.size();
    }
}
