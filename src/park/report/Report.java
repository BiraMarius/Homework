package park.report;

import java.time.LocalDateTime;

public class Report {
    private static int id;
    private LocalDateTime date;
    private static int carsIn;
    private static int carsOut;
    private static int carsLeft;
    private static long income;

    public Report(LocalDateTime date) {
        this.date = date;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Report.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public static int getCarsIn() {
        return carsIn;
    }

    public static void setCarsIn(int carsIn) {
        Report.carsIn = carsIn;
    }

    public static int getCarsOut() {
        return carsOut;
    }

    public static void setCarsOut(int carsOut) {
        Report.carsOut = carsOut;
    }

    public static int getCarsLeft() {
        return carsLeft;
    }

    public static void setCarsLeft(int carsLeft) {
        Report.carsLeft = carsLeft;
    }

    public static long getIncome() {
        return income;
    }

    public static void setIncome(long income) {
        Report.income = income;
    }
}
