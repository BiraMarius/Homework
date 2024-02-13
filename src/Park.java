import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Car> cars = new ArrayList<>();

    public void addParkedCar(Car carAdded){
        cars.add(carAdded);
        carAdded.park();
    }

    public void payParking(int indexOfPaidCar, String paymentMethod){
        try{
            int i = indexOfPaidCar;
            cars.get(i).getId();
            cars.get(i).setPayment("paid");
            System.out.println("Parking "+cars.get(i).getPayment());

        }
        catch (Exception carNotFound){
            System.out.println("Parking not paid, car not found!");
        }
    }

    public void showParkedCars(){
        for(int i=0; i<=cars.size()-1;i++){
            cars.get(i).details();
        }
    }

}
