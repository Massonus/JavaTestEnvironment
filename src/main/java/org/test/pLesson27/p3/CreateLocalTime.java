package org.test.pLesson27.p3;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CreateLocalTime {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("+3"));
        LocalTime withTemporalAccessor = LocalTime.from(zonedDateTime);
        System.out.println("withTemporalAccessor - " + withTemporalAccessor);

        LocalTime now = LocalTime.now();
        System.out.println("now - " + now);

        LocalTime of1 = LocalTime.of(12,04);
        LocalTime of2 = LocalTime.of(12,04,12);
        LocalTime of3 = LocalTime.of(12,04,12,8475);
        System.out.println("of1 - " + of1);
        System.out.println("of2 - " + of2);
        System.out.println("of3 - " + of3);

        LocalTime ofInstant = LocalTime.ofInstant(Instant.EPOCH, ZoneId.of("+12"));
        System.out.println("ofInstant - " + ofInstant);

        LocalTime ofNanoOfDay = LocalTime.ofNanoOfDay(5_000_000_000l);
        System.out.println("ofNanoOfDay - " + ofNanoOfDay);

        LocalTime ofSecondOfDay = LocalTime.ofSecondOfDay(5_000l);
        System.out.println("ofSecondOfDay - " + ofSecondOfDay);

        LocalTime parse1 = LocalTime.parse("20:45:30.956702500");
        System.out.println("parse1.getMinute() - " + parse1.getMinute());

        LocalTime parse2 = LocalTime.parse("10:15:20", DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("parse2.getHour() - " + parse2.getHour());
    }
}
