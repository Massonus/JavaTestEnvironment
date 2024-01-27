package org.test.pLesson27.p2;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalTime localTime = LocalTime.now();

        System.out.println(localDateTime);
        System.out.println(localTime);

        final Date date = new Date();

        final long time = date.getTime();

        System.out.println(time);

        System.out.println(date);

        Date date1 = new Date();

        LocalDateTime localDateTime1 = date1.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
        System.out.println("Date: " + date);
        System.out.println("LocalDateTime: " + localDateTime);

    }

}
