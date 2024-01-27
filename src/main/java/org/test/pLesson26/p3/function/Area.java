package org.test.pLesson26.p3.function;

import java.util.function.Function;

public class Area {
    public static void main(String[] args) {
        Function<Double, Double> circle = r -> r * r * Math.PI;

        System.out.println("area = " + circle.apply(2d));

        Function<Double, Double> sphere = x -> 4 * x;

        System.out.println("sphere = " + sphere.compose(circle).apply(2d));
    }
}
