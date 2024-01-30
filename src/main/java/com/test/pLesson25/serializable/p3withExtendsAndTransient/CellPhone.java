package com.test.pLesson25.serializable.p3withExtendsAndTransient;

import java.io.Serializable;

public class CellPhone extends Phone implements Serializable {
    private static final long serialVersionUID = 1L;
    private int price;
    private String model;
    private Battery battery;
//    private transient Battery battery;

    public CellPhone() {
    }

    public CellPhone(int year, int price, String model, Battery battery) {
        super(year);
        System.out.println("CellPhone constructor");
        this.price = price;
        this.model = model;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", battery=" + battery +
                ", year=" + getYear() +
                '}';
    }
}
