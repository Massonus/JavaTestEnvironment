package com.test.lesson12.p3;

import java.util.Calendar;

public enum Months {
    DECEMBER(31), JANUARY(31),

    FEBRUARY {
        @Override
        public int getDays() {
            if (Calendar
                    .getInstance()
                    .get(Calendar.YEAR) % 4 == 0) {
                return 29;
            }
            return 28;
        }
    },

    MARCH(31), APRIL(30), MAY(31),
    JUNE(30), JULY(31), AUGUST(31),
    SEPTEMBER(30), OCTOBER(31), NOVEMBER(30);

    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    Months() {
    }

    Months(int days) {
        this.days = days;
    }

}
