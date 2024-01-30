package com.test.lesson19.p3;

import java.util.Comparator;

public class ComparatorBySpeed implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o2.getSpeed() - o1.getSpeed();
    }
}
