package park.report;

import java.time.LocalDateTime;

public class Report {
    private static int id;
    private String date;
    private int carsIn=0;
    private int carsOut=0;
    private int carsLeft=0;
    private static long income=0;

    public Report(String date) {
        this.date = date;
        id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Report.id = id;
    }

    public int getCarsIn() {
        return carsIn;
    }

    public void setCarsIn(int carsIn) {
        this.carsIn = carsIn;
    }

    public int getCarsOut() {
        return carsOut;
    }

    public void setCarsOut(int carsOut) {
        this.carsOut = carsOut;
    }

    public int getCarsLeft() {
        return carsLeft;
    }

    public void setCarsLeft(int carsLeft) {
        this.carsLeft = carsLeft;
    }

    public long getIncome() {
        return income;
    }

    public void setIncome(long income) {
        this.income = income;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
