package park;

import park.operations.ParkOperations;
import park.report.Report;
import park.vehicle.Car;
import park.report.Report.*;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.*;

public class Park extends ParkOperations {
    private List<Car> cars = new ArrayList<>();
    private List<Report> reports = new LinkedList<>();

    public void enter(Car car){
        super.enterIntoParking(cars, reports, car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Report> getReports() {
        return reports;
    }
}
