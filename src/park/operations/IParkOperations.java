package park.operations;

import park.vehicle.Car;

import java.util.List;

public interface IParkOperations {
    void enterIntoParking(List<Car> cars, Car carAdded);
    void exitParking(List<Car> cars, int indexOfRemovedCar); // TODO1: use object not index
    //public void pay(String registrationNo,String payment);

    void exitP(List<Car> cars, Car carAdded);


}
