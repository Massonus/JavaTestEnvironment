package com.test.lesson19.p3;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 280, 40000);
        Car audi = new Car("Audi", 260, 40000);
        Car ford = new Car("Ford", 180, 20000);
        Car mercedes = new Car("Mercedes", 260, 50000);
        Car honda = new Car("Honda", 220, 35000);
        Car infinity = new Car("Infinity", 220, 40000);

        Set<Car> cars = new TreeSet<>();
        cars.add(bmw);
        cars.add(audi);
        cars.add(ford);
        cars.add(mercedes);
        cars.add(honda);
        cars.add(infinity);

        System.out.println("Comparable");
        System.out.println(cars);

        List list = new ArrayList(cars);

        /*Comparator comparatorByPrice = Comparator.comparing(Car::getPrice);*/

        Comparator comparatorByPrice = new ComparatorByPrice();

        Collections.sort(list, comparatorByPrice);
        System.out.println("comparatorByPrice");
        System.out.println(list);

        /*Comparator comparatorBySpeedReverseOrder = Comparator.comparing(Car::getSpeed, Comparator.reverseOrder());*/

        Comparator comparatorBySpeedReverseOrder = new ComparatorBySpeed();

        Collections.sort(list, comparatorBySpeedReverseOrder);
        System.out.println("comparatorBySpeedReverseOrder");
        System.out.println(list);

        Comparator comparatorByBrand = Comparator.comparing(Car::getBrand);
        Collections.sort(list, comparatorByPrice.thenComparing(comparatorByBrand));
        System.out.println("comparatorByPrice then by brand");
        System.out.println(list);

    }
}
