import java.time.LocalDateTime;

public abstract class Vehiclee {
    public static int id;
    private String registationNo;
    private LocalDateTime parkingTime;
    private LocalDateTime unParkingTime;
    private String payment;

    public Vehiclee(String registationNo) {
        this.registationNo = registationNo;
    }

    public abstract void park();

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Vehiclee.id = id;
    }

    public String getRegistationNo() {
        return registationNo;
    }

    public void setRegistationNo(String registationNo) {
        this.registationNo = registationNo;
    }

    public LocalDateTime getParkingTime() {
        return parkingTime;
    }

    public void setParkingTime(LocalDateTime parkingTime) {
        this.parkingTime = parkingTime;
    }

    public LocalDateTime getUnParkingTime() {
        return unParkingTime;
    }

    public void setUnParkingTime(LocalDateTime unParkingTime) {
        this.unParkingTime = unParkingTime;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
