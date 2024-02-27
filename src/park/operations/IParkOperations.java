package park.operations;

import park.vehicle.Car;

import java.util.List;

public interface IParkOperations {
    void enterIntoParking(List<Car> cars, Car carAdded);
    void exitParkingByIndex(List<Car> cars, int indexOfRemovedCar); // TODO 1 use object not index

    //public void pay(String registrationNo,String payment);

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    void exitParkingByObject(List <Car> cars, Car carAdded);
    void exitP2(List <Car> cars, Car carAdded);


}
