import java.time.LocalDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Car> cars = new ArrayList<>();

    public void addParkedCar(Car carAdded){
        cars.add(carAdded);
        carAdded.setParkingTime(parkingTime());
        carAdded.park();
    }

    public void pay(String registrationNo,String payment){
        int index=findIndexByPlate(registrationNo, cars);
        LocalDateTime parkingTime = cars.get(index).getParkingTime();
        cars.get(index).setUnParkingTime(unParkingTime());
        LocalDateTime unParkingTime = cars.get(index).getUnParkingTime();
        Duration durationOfParking = Duration.between(parkingTime, unParkingTime);
        long hours = durationOfParking.toHours();
        System.out.println("Time parked: "+hours);
        int valuePerHour = 10;
        if(hours-1 > 1){
            long price = (hours-1)*10;
            System.out.println("Price for parking is: "+price);
            System.out.println("You paid with "+payment+".");
            cars.get(index).setPayment(payment);
            removeParkedCar(index);
        } else {
            System.out.println("Free parking!");
            removeParkedCar(index);
        }
    }

    public int findIndexByPlate(String registrationNo, List<Car> cars){
        for(int i=0; i<= cars.size();i++){
            if(cars.get(i).getRegistationNo() == registrationNo){ return i;}
        } return -1;
    }

    public void showParkedCars(){
        for(int i=0; i<=cars.size()-1;i++){
            cars.get(i).details();
        }
    }

    public void removeParkedCar(int indexOfRemovedCar){
        int i=indexOfRemovedCar;
        System.out.println("The car with the registration number of: "+cars.get(i).getRegistationNo()+" was removed.");
        cars.remove(i);
    }

    // Fixed parsing DateTime
    public LocalDateTime parkingTime(){
        LocalDateTime parkingTime = LocalDateTime.now();
        return parkingTime;
    }

    public LocalDateTime unParkingTime(){
        LocalDateTime unParkingTime = LocalDateTime.now();
        return unParkingTime;
    }

//    public void payParking(int indexOfPaidCar, String paymentMethod){
//
//        try{
//            int i = indexOfPaidCar;
//            cars.get(i).getId();
//            cars.get(i).setPayment("paid");
//            System.out.println("Parking "+cars.get(i).getPayment());
//
//        }
//        catch (Exception carNotFound){
//            System.out.println("Parking not paid, car not found!");
//        }
//    }

}
