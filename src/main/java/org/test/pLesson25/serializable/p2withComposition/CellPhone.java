package org.test.pLesson25.serializable.p2withComposition;

import java.io.Serializable;

public class CellPhone implements Serializable {
    private static final long serialVersionUID = 1L;
    private int price;
    private String model;
    private Battery battery;

    public String getModel() {
        return model;
    }

    public Battery getBattery() {
        return battery;
    }

    public CellPhone() {
    }

    public CellPhone(int price, String model, Battery battery) {
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
                '}';
    }
}
