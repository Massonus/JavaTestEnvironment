package com.test.pLesson27.p3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeMethods {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        System.out.println("LocalTime       : " + now);
        System.out.println("Hour            : " + now.getHour());
        System.out.println("Minute          : " + now.getMinute());
        System.out.println("MINUTE_OF_HOUR  : " + now.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Second          : " + now.getSecond());
        System.out.println("Nano            : " + now.getNano());

        System.out.println("#toSecondOfDay  : " + now.toSecondOfDay());
        System.out.println("#toNanoOfDay    : " + now.toNanoOfDay());
        System.out.println("#toEpochSecond  : " + now.toEpochSecond(LocalDate.now(), ZoneOffset.UTC));

        System.out.println("---------------------------------");

        System.out.println("6 hours later       : " + now.plusHours(6));
        System.out.println("8 hours before      : " + now.minus(8, ChronoUnit.HOURS));
        System.out.println("Minus 40 minutes    : " + now.minusMinutes(40));
        System.out.println("Plus 20 seconds     : " + now.plusSeconds(20));
        System.out.println("Plus 340000 nanos   : " + now.plusNanos(340000));
        System.out.println("160 minutes before  : " + now.minus(Duration.ofMinutes(160)));
        System.out.println("2 hours later       : " + now.plus(Duration.ofHours(2)));

        System.out.println("---------------------------------");

        LocalTime localTime = LocalTime.parse("20:15:30");
        System.out.println(now + " is after " + localTime + " : " + now.isAfter(localTime));
    }
}

