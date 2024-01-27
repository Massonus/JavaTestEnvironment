package org.test.lesson12.p2;

public enum Months {
    DECEMBER(31), JANUARY(31), FEBRUARY,
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
