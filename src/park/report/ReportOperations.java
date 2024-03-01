package park.report;
import park.vehicle.Car;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReportOperations {
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

    public static void addRCarsToCt(Report report){
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

    public String timeFormatter(LocalDateTime time){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedTime = time.format(formatter);
        return formattedTime;
    }

    //TODO: Check if the verifications in search are correct, in LocalDate is the date and hour
    //TODO: store the date into String in Report, and check equals strings.

}
