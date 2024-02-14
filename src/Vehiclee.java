import java.time.LocalDateTime;

public abstract class Vehiclee {
    public static int id;
    private String registationNo;
    private String parkingTime;
    private String payment;

    public Vehiclee(String registationNo) {
        this.registationNo = registationNo;
    }

    public abstract void park();
    public abstract void pay();


    public String getRegistationNo() {
        return registationNo;
    }

    public void setRegistationNo(String registationNo) {
        this.registationNo = registationNo;
    }

    public String getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(String parkingTime) {
        this.parkingTime = parkingTime;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Vehiclee.id = id;
    }
}
