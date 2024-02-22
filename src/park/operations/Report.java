/*
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Report {
    private static int id;
    private LocalDateTime date;
    private int carNumber;
    //private Set<String> reports = new HashSet<String>();

    public Report(){
        ++id;
        LocalDateTime date = LocalDateTime.now();
        this.date=date;
        carNumber = park.vehicle.Car.getId();
    }

    public void details(){
        System.out.println("############    DETAILS $$$REPORT   ###########");
        System.out.println(getId());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public  int getCarNumber() {
        return carNumber;
    }

    public  void setCarNumber(int carNumber) {
        Report.carNumber = carNumber;
    }

    /*
    public void generareRaport(){
        Set<String> reports = new HashSet<String>();
        reports.add("");
    }

}
        */