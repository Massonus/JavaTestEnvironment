package com.test.pLesson30.p3;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        Integer sum = numbers.stream().parallel().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        List<String> languages = List.of("Java", "JavaScript", "Python");
        String concatResult = languages.parallelStream().reduce("result = ", (a, b) -> a + " " + b);
        System.out.println(concatResult);

        concatResult = languages.stream().reduce("result = ", (a, b) -> a + " " + b);
        System.out.println(concatResult);



        String start = "result = ";
        BinaryOperator<String> combiner = (a, b) -> {
            if (b.startsWith(start)) {
                return a + b.substring(start.length());
            }
            return a + b;
        };

        BiFunction<String, String, String> reduceFunction = (a, b) -> a + " " + b;

        concatResult = languages.parallelStream().reduce(start, reduceFunction, combiner);
        System.out.println(concatResult);

    }
}
