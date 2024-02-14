import java.time.LocalDateTime;
import java.time.Duration;

public class Car extends Vehiclee {
    public Car(String registationNo) {
        super(registationNo);
    }

    @Override
    public void park(){
        System.out.println("##################  TICKET  #####################\n" +
                           "Registration number plate:  "+getRegistationNo()+"\n"+
                           "Parking details:  "+getParkingTime()+"\n"+
                           "Ticket NO: "+getId()+"\n"+
                           "#################################################");
    }

    public void details(){
        System.out.println(getId());
        System.out.println(getRegistationNo());
        System.out.println(getParkingTime());
        System.out.println();
    }

    @Override
    public void pay(){

    }




}
