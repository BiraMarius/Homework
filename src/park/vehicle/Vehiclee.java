package park.vehicle;

import java.time.LocalDateTime;

public abstract class Vehiclee {

    private static int ct;
    private static int id=0;//trebuie schimbat id cu co, co fiind counterul de fapt


    private String registationNo;
    private LocalDateTime parkingTime;
    private LocalDateTime unParkingTime;
    private String payment;

    public Vehiclee(String registationNo) {
        this.registationNo = registationNo;
        //++id;
    }

    public abstract void park();

//    public static int getId() {
//        return id;
//    }
//
//    public static void setId(int id) {
//        Vehiclee.id = ++id;
//    }


    public static int getCt() {
        return ct;
    }

    public static void setCt(int ct) {
        Vehiclee.ct = ++ct;
    }

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
