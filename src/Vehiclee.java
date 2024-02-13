public abstract class Vehiclee {
    public static int id;
    private String registationNo;
    private String parkingHour;
    private String parkingDate;
    private String unParkingHour;
    private String payment;

    public Vehiclee(String registationNo, String parkingHour, String parkingDate) {
        this.registationNo = registationNo;
        this.parkingHour = parkingHour;
        this.parkingDate = parkingDate;
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

    public String getParkingHour() {
        return parkingHour;
    }

    public void setParkingHour(String parkingHour) {
        this.parkingHour = parkingHour;
    }

    public String getParkingDate() {
        return parkingDate;
    }

    public void setParkingDate(String parkingDate) {
        this.parkingDate = parkingDate;
    }

    public String getUnParkingHour() {
        return unParkingHour;
    }

    public void setUnParkingHour(String unParkingHour) {
        this.unParkingHour = unParkingHour;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String paiment) {
        this.payment = paiment;
    }
}
