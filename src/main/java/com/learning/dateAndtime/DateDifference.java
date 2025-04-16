package com.learning.dateAndtime;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

    public static void main(String[] args) {
        // Define two dates
        LocalDate startDate = LocalDate.of(2024, 7, 22);
        LocalDate endDate = LocalDate.of(2025, 4, 7);

        // Calculate the difference between the two dates
        Period period = Period.between(startDate, endDate);

        // Print the difference
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
        System.out.println("Years: " + period.getYears() + " Months: " + period.getMonths() + " Days: " + period.getDays());
    }
}
