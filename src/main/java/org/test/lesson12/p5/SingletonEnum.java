package org.test.lesson12.p5;

public enum SingletonEnum {
    SINGLETON;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

