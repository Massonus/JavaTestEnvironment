package org.test.pLesson27.p2;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class LocalDateMethods {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        System.out.println("LocalDate    : " + now);
        System.out.println("ZoneId       : " + now.atStartOfDay(ZoneId.systemDefault()));

        System.out.println("DayOfMonth   : " + now.getDayOfMonth());
        System.out.println("MonthValue   : " + now.getMonthValue());
        System.out.println("YEAR         : " + now.getLong(ChronoField.YEAR));

        System.out.println("DayOfWeek    : " + now.getDayOfWeek());
        System.out.println("Month        : " + now.getMonth());
        System.out.println("DayOfYear    : " + now.getDayOfYear());

        System.out.println("Chronology   : " + now.getChronology());
        System.out.println("Era          : " + now.getEra());

        System.out.println("LeapYear     : " + now.isLeapYear());
        System.out.println("LengthOfMonth: " + now.lengthOfMonth());
        System.out.println("LengthOfYear : " + now.lengthOfYear());

        System.out.println("LocalDate.toEpochDay()   : " + now.toEpochDay());
        System.out.println("LocalDate.toEpochSecond(): " + now.toEpochSecond(LocalTime.MIDNIGHT, ZoneOffset.UTC));

        System.out.println("---------------------------------");

        System.out.println("15 days later : " + now.plusDays(15));
        System.out.println("3 weeks before: " + now.minus(3, ChronoUnit.WEEKS));
        System.out.println("Minus 4 months: " + now.minusMonths(4));
        System.out.println("Plus 4 years  : " + now.plusYears(4));
        System.out.println("5 years later : " + now.plus(Period.ofYears(5)));

        System.out.println("---------------------------------");

        LocalDateTime localDateTime1 = now.atTime(3, 10);
        System.out.println("atTime 3, 10 to " + now + "          : " + localDateTime1);

        LocalDateTime localDateTime2 = now.atTime(15, 10, 25);
        System.out.println("atTime 3, 10, 25 to " + now + "      : " + localDateTime2);

        LocalDateTime localDateTime3 = now.atTime(LocalTime.NOON);
        System.out.println("atTime LocalTime.NOON to " + now + " : " + localDateTime3);


        System.out.println("---------------------------------");
        LocalDate localDate1 = LocalDate.of(2022,9, 25);
        LocalDate localDate2 = LocalDate.of(2022,10, 01);

        Stream<LocalDate> daysUntil = localDate1.datesUntil(localDate2);

        System.out.println("--- " + localDate1 + " datesUntil " + localDate2 + " ---");
        daysUntil.forEach(System.out::println);
    }
}
