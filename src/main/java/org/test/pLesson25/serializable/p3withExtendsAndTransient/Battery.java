package org.test.pLesson25.serializable.p3withExtendsAndTransient;

import java.io.Serializable;

public class Battery implements Serializable {
//public class Battery implements  {
    private int power;

    public Battery(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "power=" + power +
                '}';
    }
}
