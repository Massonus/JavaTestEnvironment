package com.test.lesson17.p3;

public class Utils<T> {


    T[] values;

    public Utils(T[] values) {
        this.values = values;
    }

    public void print(final T value) {
        System.out.println(value);
    }

    public T getValue(final T value) {
        return value;
    }

    public T getValue(final int index) {
        if (values.length > index) {
            return values[index];
        }

        throw new IllegalArgumentException();
    }


    public Integer getIntValue(final int value) {
        return value;
    }

    public boolean getBool(final Boolean value) {
        return value != null && value;
    }


}
