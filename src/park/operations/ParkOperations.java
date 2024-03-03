package park.operations;
import park.report.Report;
import park.vehicle.Car;
import park.vehicle.Vehiclee;
import park.report.Report.*;
import park.report.ReportOperations.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import static park.operations.util.ParkOperationsUtil.*;
import static park.report.ReportOperations.*;

public class ParkOperations implements IParkOperations {

    public void enterIntoParking(List<Car> cars, List<Report> reports, Car carAdded){
        cars.add(carAdded);
        carAdded.setParkingTime(LocalDateTime.now());
        carAdded.park();
        addCarsToCt(searchReportByDate(reports, timeFormatter(LocalDateTime.now())));
    }

    public void exitParkingByIndex(List <Car> cars, List<Report> reports, int indexOfRemovedCar){
        int i=indexOfRemovedCar;
        //System.out.println("The car with the registration number of: "+cars.get(i).getRegistationNo()+" was removed.");
        removedCarsToCt(searchReportByDate(reports, timeFormatter(LocalDateTime.now())));
        cars.remove(i);
    }

    public void exitParkingByObject(List <Car> cars, List<Report> reports, Car carAdded){
        //System.out.println("The car with the registration number of: "+carAdded.getRegistationNo()+" was removed.");
        removedCarsToCt(searchReportByDate(reports, timeFormatter(LocalDateTime.now())));
        cars.remove(carAdded);
    }


    public void paymentWithRegistrationNo(List<Car> cars, List<Report> reports, String registrationNo, String payment){
        Car car = findCarObjByPlate(registrationNo, cars);
        paymentWithObject(cars, reports, car, payment);
    }

    public void paymentWithObject(List<Car> cars, List<Report> reports, Car car, String payment){
        car.setPayment(payment);
        calculateIncome(searchReportByDate(reports, timeFormatter(LocalDateTime.now())),  priceCalculator(duration(cars, car)));
        cars.remove(car);
    }



    //TODO 7 https://www.tutorialspoint.com/log4j/log4j_sample_program.htm delete all the System.out.println and use Log4J
    //TODO 8 LinkedList for raports

}

