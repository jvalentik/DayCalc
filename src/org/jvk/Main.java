package org.jvk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DayCalc calculator;
        Scanner in = new Scanner(System.in);
        int day;
        int month;
        int year;
        System.out.println("Enter day: ");
        day = in.nextInt();
        System.out.println("Enter month: ");
        month = in.nextInt();
        System.out.println("Enter year: ");
        year = in.nextInt();
        calculator = new DayCalc(day, month, year);
        calculator.Result();
        in.close();
    }
}
