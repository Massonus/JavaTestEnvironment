package com.test.pLesson27.p2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.IsoFields;
import java.time.temporal.JulianFields;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;

public class FieldsExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("LocalDate : " + localDate);

        System.out.println("----------- IsoFields -----------");

        System.out.println("DAY_OF_QUARTER          : " + localDate.get(IsoFields.DAY_OF_QUARTER));
        System.out.println("WEEK_OF_WEEK_BASED_YEAR : " + localDate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
        System.out.println("WEEK_BASED_YEAR         : " + localDate.get(IsoFields.WEEK_BASED_YEAR));
        System.out.println("QUARTER_OF_YEAR         : " + localDate.get(IsoFields.QUARTER_OF_YEAR));

        System.out.println("----------- JulianFields -----------");

        System.out.println("JULIAN_DAY          : " + localDate.getLong(JulianFields.JULIAN_DAY));
        System.out.println("RATA_DIE            : " + localDate.getLong(JulianFields.RATA_DIE));
        System.out.println("MODIFIED_JULIAN_DAY : " + localDate.getLong(JulianFields.MODIFIED_JULIAN_DAY));

        System.out.println("----------- WeekFields -----------");

        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 1);

        TemporalField dayOfWeek = weekFields.dayOfWeek();
        TemporalField weekBasedYear = weekFields.weekBasedYear();
        TemporalField weekOfMonth = weekFields.weekOfMonth();
        TemporalField weekOfWeekBasedYear = weekFields.weekOfWeekBasedYear();

        System.out.println("dayOfWeek           : " + localDate.get(dayOfWeek));
        System.out.println("weekBasedYear       : " + localDate.get(weekBasedYear));
        System.out.println("weekOfMonth         : " + localDate.get(weekOfMonth));
        System.out.println("weekOfWeekBasedYear : " + localDate.get(weekOfWeekBasedYear));
    }
}
