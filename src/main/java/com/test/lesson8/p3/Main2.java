package com.test.lesson8.p3;

public class Main2 {

    public static void main(String[] args) {

        setUp(1, 2, 3, 4, 5, 6, 7, 8);

    }

    public static void setUp(int ... args) {
        for (int arg : args) {
            System.out.println(arg);
        }
    }

}
