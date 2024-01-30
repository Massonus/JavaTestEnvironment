package com.test.pLesson27.p4;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = localDateTime.format(formatter);
        System.out.println("Before : " + localDateTime);
        System.out.println("After : " + formatDateTime);

        System.out.println("---------------------------------------");

        formatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse("February-23-2019", formatter);
        System.out.println("Before : February-23-2019");
        System.out.println("After : " + date);

        System.out.println("---------------------------------------");

        date = LocalDate.now();
        String after = DateTimeFormatter.RFC_1123_DATE_TIME.format(date.atStartOfDay(ZoneId.of("UTC-3")));
        System.out.println("Before : " + date);
        System.out.println("After : " + after);

        System.out.println("---------------------------------------");

        after = DateTimeFormatter.ISO_OFFSET_DATE.format(date.atStartOfDay(ZoneId.of("UTC+3")));
        System.out.println("Before : " + date);
        System.out.println("After : " + after);

        System.out.println("---------------------------------------");

        System.out.println(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.ENGLISH).format(date));
        System.out.println(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.ENGLISH).format(date));
        System.out.println(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH).format(date));
        System.out.println(DateTimeFormatter
                .ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.ENGLISH).format(date));

        System.out.println("---------------------------------------");

        LocalTime time = LocalTime.of(13, 12, 45);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, ZoneId.of("Europe/Kiev"));
        System.out.println(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ENGLISH).format(zonedDateTime));
        System.out.println(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.ENGLISH).format(zonedDateTime));
        System.out.println(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.ENGLISH).format(zonedDateTime));
        System.out.println(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.ENGLISH).format(zonedDateTime));

        System.out.println(DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.ROOT).format(zonedDateTime));
    }
}
