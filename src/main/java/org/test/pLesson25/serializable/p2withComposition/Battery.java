package org.test.pLesson25.serializable.p2withComposition;

import java.io.Serializable;

//public class Battery  {
public class Battery implements Serializable {
    private static final long serialVersionUID = 1L;
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
