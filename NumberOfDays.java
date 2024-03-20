package main;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class NumberOfDays {
    public static void main(String[] args) {

        LocalDate dateFrom = LocalDate.of(2024, Month.MARCH, 15);

        LocalDate dateTo = LocalDate.of(2024, Month.MAY, 17);

        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);

    }
}
