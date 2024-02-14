import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

//    public void payParking(int indexOfPaidCar, String paymentMethod){
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

    public String parkingTime(){
        LocalDateTime parkingTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd/MM/yyyy");
        String formattedParkingTime = parkingTime.format(formatter);
        //LocalDateTime parsedParkingTime = LocalDateTime.parse(formattedParkingTime, formatter);
        return formattedParkingTime;
        //LocalDateTime formattedParkingTime = LocalDateTime.parse(parkingTime.format(formatter));
    }

    public String unParkingTime(){
        LocalDateTime unparkingTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy");
        String formattedunParkingTime = unparkingTime.format(formatter);
        return formattedunParkingTime;
    }



}
