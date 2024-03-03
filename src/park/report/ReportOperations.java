package park.report;
import park.vehicle.Car;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportOperations implements IReportOperations {
    public static Report searchReportByDate(List<Report> reports, String date){
            for(int i=0; i<reports.size(); i++){
                if(reports.get(i).getDate().equals(date)){
                      return reports.get(i);
                }
            } return createNewReport(reports, date);
    }

    public static Report createNewReport(List<Report> reports, String date){
        Report report = new Report(date);
        reports.add(report);
        return report;
    }

    public static void addCarsToCt(Report report){
        report.setCarsIn(report.getCarsIn()+1);
    }

    public static void removedCarsToCt(Report report){
        report.setCarsOut(report.getCarsOut()+1);
    }

    public static void carsLeft(Report report){
        int carsLeft = report.getCarsIn()-report.getCarsOut();
        report.setCarsLeft(carsLeft);
    }

    public static long calculateIncome(Report report, int price){
        report.setIncome(report.getIncome()+price);
        return report.getIncome();
    }

    public static void completeReport(List<Report> reports, Car car, int price){
        calculateIncome(searchReportByDate(reports, car.timeFormatter(car.getUnParkingTime())), price);

    }

    public static String timeFormatter(LocalDateTime time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedTime = time.format(formatter);
        return formattedTime;
    }

    public static void saveReport(Report report, LocalDateTime date){
        System.out.println("              REPORT               \n"+
                           "Date of the report: "+report.getDate()+"\n"+
                           "Cars that entered: "+report.getCarsIn()+"\n"+
                           "Cars that leaved: "+report.getCarsOut()+"\n"+
                           "Cars left: "+report.getCarsLeft()+"\n"+
                           "Income: "+report.getIncome()+"\n"+
                           "---------------------------------------");
    }

    //TODO: Check if the verifications in search are correct, in LocalDate is the date and hour
    //TODO: store the date into String in Report, and check equals strings.
    //Update Park operation with Report functions

}
