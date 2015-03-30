package org.jvk;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * Created by powerj-sk on 29/03/2015.
 */
public class DayCalc {
    private LocalDate currentDate;
    private LocalDate secondDate;

    DayCalc(int day, int month, int year) {
        currentDate = LocalDate.now();
        secondDate = LocalDate.of(year, month, day);
    }

    public void Result() {
        System.out.println("From the date: " + currentDate.toString());
        System.out.println("to the date: " + secondDate.toString());
        System.out.println("is " + currentDate.until(secondDate, ChronoUnit.DAYS));
    }
}
