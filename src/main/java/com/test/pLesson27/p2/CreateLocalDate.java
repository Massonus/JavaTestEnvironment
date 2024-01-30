package com.test.pLesson27.p2;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CreateLocalDate {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowWithClockSystemDefaultZone = LocalDate.now(Clock.systemDefaultZone());
        LocalDate nowWithClockSystemUTC = LocalDate.now(Clock.systemUTC());
        LocalDate nowWithZoneId = LocalDate.now(ZoneId.of("+12"));

        final int i = now.compareTo(nowWithClockSystemDefaultZone);

        final boolean after = now.isAfter(nowWithZoneId);
        final boolean before = now.isBefore(nowWithZoneId);

        final boolean equal = now.isEqual(nowWithClockSystemDefaultZone);

        System.out.println(equal);

        System.out.println(after);
        System.out.println(before);

        System.out.println(i);

        System.out.println("now - " + now);
        System.out.println("nowWithClockSystemDefaultZone - " + nowWithClockSystemDefaultZone);
        System.out.println("nowWithClockSystemUTC - " + nowWithClockSystemUTC);
        System.out.println("nowWithZoneId - " + nowWithZoneId);

        LocalDate fromTemporalAccessor = LocalDate.from(ZonedDateTime.now());
        System.out.println("fromTemporalAccessor - " + fromTemporalAccessor);

        LocalDate of1 = LocalDate.of(2022, 10, 11);
        LocalDate of2 = LocalDate.of(2022, Month.DECEMBER, 11);
        LocalDate ofEpochDay = LocalDate.ofEpochDay(100);
        LocalDate ofInstant = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
        LocalDate ofYearDay = LocalDate.ofYearDay(2022, 45);
        LocalDate parse = LocalDate.parse("2022-12-27");

        System.out.println("of1 - " + of1);
        System.out.println("of2 - " + of2);
        System.out.println("ofEpochDay - " + ofEpochDay);
        System.out.println("ofInstant - " + ofInstant);
        System.out.println("ofYearDay - " + ofYearDay);
        System.out.println("parse - " + parse);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy, HH:mm-ss");
        System.out.println("with formatter - " + formatter.format(LocalDateTime.now()));
    }
}