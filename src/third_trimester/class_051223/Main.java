package third_trimester.class_051223;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now()));
    }
}
