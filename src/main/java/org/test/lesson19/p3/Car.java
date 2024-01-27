package org.test.lesson19.p3;

import java.util.Objects;

public class Car implements Comparable<Car> {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return speed == car.speed && price == car.price && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, speed, price);
    }

    @Override
    public int compareTo(Car o) {
        return this.brand.compareTo(o.brand);
    }
}
