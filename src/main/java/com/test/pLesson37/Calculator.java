package com.test.pLesson37;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Dividing an integer by zero");
        }
        return a / b;
    }
}