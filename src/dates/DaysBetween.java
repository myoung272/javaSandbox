

package dates;

import java.time.LocalDate;
import java.time.Month;
import static java.time.temporal.ChronoUnit.DAYS;


public class DaysBetween {

    public static void main(String[] args) {
        LocalDate electionDay = LocalDate.of(2020, Month.NOVEMBER, 3);
        LocalDate today = LocalDate.now();
 
        System.out.printf("%d days to go...%n", DAYS.between(today, electionDay));
    }
}
