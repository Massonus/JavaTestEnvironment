package com.test.pLesson25.serializable.p1simpleExample;

import java.io.Serializable;

public class CellPhone implements Serializable {
    private static final long serialVersionUID = 1L;
    private int price;
    private String model;

    public CellPhone() {
    }

    public CellPhone(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
