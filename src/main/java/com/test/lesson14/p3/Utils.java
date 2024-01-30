package com.test.lesson14.p3;

public class Utils<T> {

    T[] enArray;

    public void printEn(T vale) {
        System.out.println(vale);
    }

    public T getEn(T vale) {
        return vale;
    }

    public String getToString(T vale) {
        return vale.toString();
    }

    public T[] setAndGetEnArray(T[] vale) {
        enArray = vale;
        return enArray;
    }

    public boolean delete(int index) {
        if (index < enArray.length) {
            enArray[index] = null;
            return true;
        }
        return false;
    }

    public void add(T vale, int index) {
        if (enArray == null) {
            System.out.println("Empty");
            return;
        }
        enArray[index] = vale;
    }

}
