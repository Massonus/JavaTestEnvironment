package org.test.pLesson25.serializable.p3withExtendsAndTransient;

import java.io.Serializable;

//public abstract class Phone implements Serializable {     //to get value year
public abstract class Phone implements Serializable{ //to get value
    private int year;

    public Phone() {
        System.out.println("Phone Constructor");
    }

    public Phone(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "year=" + year +
                '}';
    }
}
