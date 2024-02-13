public class Car extends Vehiclee {
    public Car(String registationNo, String parkingHour, String parkingDate) {
        super(registationNo, parkingHour, parkingDate);
    }

    @Override
    public void park(){
        System.out.println("##################  TICKET  #####################\n" +
                           "Registration number plate:  "+getRegistationNo()+"\n"+
                           "Parking hour:  "+getParkingHour()+"\n"+
                           "Parking date:  "+getParkingDate()+"\n"+"\n"+
                           "Ticket NO: "+getId()+"\n"+
                           "#################################################");
    }

    public void details(){
        System.out.println(getId());
        System.out.println(getRegistationNo());
        System.out.println(getParkingHour());
        System.out.println(getParkingDate());
        System.out.println();
    }


    public void pay(){

    }


}
