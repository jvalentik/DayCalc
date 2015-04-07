package org.jvk;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Created by powerj-sk on 29/03/2015.
 */

class Today implements DisplayDate{
    private static Today instance = null;
    private LocalDate currentDate;

    private Today() {
        currentDate = LocalDate.now();
    }

    public static Today getInstance() {
        if (instance == null) {
            instance = new Today();
        }
        return instance;
    }

    public LocalDate getDate() {
        return this.currentDate;
    }

    @Override
    public void SayDate() {
        System.out.println(currentDate.toString());
    }
}

public class DayCalc {
    private Today currentDate;
    private LocalDate secondDate;

    DayCalc(int day, int month, int year) {
        currentDate = Today.getInstance();
        secondDate = LocalDate.of(year, month, day);
    }

    public void ShowResult() {
        System.out.println("From the date: ");
        currentDate.SayDate();
        System.out.println("to the date: " + secondDate.toString());
        System.out.println("is " + currentDate.getDate().until(secondDate, ChronoUnit.DAYS));
    }
}
