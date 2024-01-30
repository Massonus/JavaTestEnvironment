package com.test.lesson19.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 280, 30000);
        Car audi = new Car("Audi", 260, 40000);
        Car ford = new Car("Ford", 180, 20000);

        List<Car> cars1 = new ArrayList<>();
        cars1.add(bmw);
        cars1.add(audi);
        cars1.add(ford);

        Collections.sort(cars1);

        for (Car car : cars1) {
            System.out.println(car);
        }
    }
}
