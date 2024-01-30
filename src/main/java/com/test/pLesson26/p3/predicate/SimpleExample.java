package com.test.pLesson26.p3.predicate;

import java.util.function.Predicate;

public class SimpleExample {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-7));
    }
}
