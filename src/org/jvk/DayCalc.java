package org.jvk;

import java.util.*;


/**
 * Created by powerj-sk on 29/03/2015.
 */
public class DayCalc {
    private TimeZone localZone;
    private Calendar currentDate;
    private Calendar secondDate;

    DayCalc(int day, int month, int year) {
        localZone =  TimeZone.getTimeZone("GMT+01:00");
        currentDate = new GregorianCalendar(localZone);
        secondDate = new GregorianCalendar(year, month, day);
    }

    public void Result() {
        System.out.println("From the date: " + currentDate.get(Calendar.DATE));
        System.out.println("to the date: " + secondDate.get(Calendar.DATE));
        System.out.println("it is ");
    }






}
