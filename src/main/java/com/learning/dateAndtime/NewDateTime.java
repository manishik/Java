package com.learning.dateAndtime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NewDateTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);

        Date date = new Date();
        System.out.println("date = " + date);

        Calendar calendar = new GregorianCalendar();
        System.out.println("calendar = " + calendar);
        System.out.println("calendar.getTime() = " + calendar.getTime());

        LocalDateTime currentLocalDateTime = LocalDateTime.now(); // USA EST
        System.out.println("currentLocalDateTime = " + currentLocalDateTime);
        ZoneId zoneIdIST = ZoneId.of("Asia/Kolkata");
        ZoneId zoneIdEST = ZoneId.of("America/New_York");
        ZoneId zoneIdPST = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTimeCurrentEST = currentLocalDateTime.atZone(zoneIdEST); //India Time
        ZonedDateTime zonedDateTimeCurrentIST = zonedDateTimeCurrentEST.withZoneSameInstant(zoneIdIST); //USA ET Time
        ZonedDateTime zonedDateTimeCurrentPST = currentLocalDateTime.atZone(zoneIdEST).withZoneSameInstant(zoneIdPST); //USA PT Time
        System.out.println("zonedDateTimeCurrentEST = " + zonedDateTimeCurrentEST);
        System.out.println("zonedDateTimeCurrentPST = " + zonedDateTimeCurrentPST);
        System.out.println("zonedDateTimeCurrentIST = " + zonedDateTimeCurrentIST);


        String date_format_string = "dd-M-yyyy hh:mm:ss a";
        String dateInString = "20-11-2021 09:00:00 AM"; // Just some random Date & Time
        LocalDateTime localDateTime = LocalDateTime.parse(dateInString, DateTimeFormatter.ofPattern(date_format_string));
        ZoneId singaporeZoneId = ZoneId.of("Asia/Singapore");
        ZonedDateTime asiaZonedDateTime = localDateTime.atZone(singaporeZoneId);
        System.out.println("Date (Singapore) from given random date : " + asiaZonedDateTime);
        System.out.println("Date (New York) : " + asiaZonedDateTime.withZoneSameInstant(zoneIdEST));
        System.out.println("Date (Singapore) from currentLocalDateTime: " + currentLocalDateTime.atZone(zoneIdEST).withZoneSameInstant(singaporeZoneId));

        Instant instant = Instant.now();
        System.out.println("instant = " + instant);

    }
}
