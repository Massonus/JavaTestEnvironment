package org.test.lesson21.p5;

import java.io.Serializable;

public class Mouse implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                '}';
    }
}
