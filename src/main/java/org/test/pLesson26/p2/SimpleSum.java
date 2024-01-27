package org.test.pLesson26.p2;


interface Function {
    double func(double a, double b, double c);
}

public class SimpleSum {
    public static void main(String[] args) {
        Function sum = (a, b, c) -> a + b + c;

        double result = sum.func(6, 3.7, 7.7);
        
        System.out.println(" result = " + result);
    }
}
