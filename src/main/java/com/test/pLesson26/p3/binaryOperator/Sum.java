package com.test.pLesson26.p3.binaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Sum {
    public static <T> T binarySum(List<T> list, T init, BinaryOperator<T> func) {
        T result = init;
        for (T t : list) {
            result = func.apply(result, t);
        }
        return result;
    }

    public static int intBinary(List <Integer> list, IntBinaryOperator func) {
        int result = 0;
        for (int t : list) {
            result = func.applyAsInt(result, t);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer result = binarySum(numbers, 0, (a, b) -> a + b);
        System.out.println(result);

        result = intBinary((numbers), (a, b) -> a + b);
        System.out.println(result);

        result = binarySum(numbers, 0, Integer::sum);
        System.out.println(result);
    }

}
