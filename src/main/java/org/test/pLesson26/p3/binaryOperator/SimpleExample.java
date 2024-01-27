package org.test.pLesson26.p3.binaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class SimpleExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        System.out.println(multiply.apply(3, 5));
        System.out.println(multiply.apply(10, -2));

        UnaryOperator<Integer> multiply2 = x -> x * 5;
        System.out.println(multiply2.apply(5));
    }
}
