package com.test.pLesson30.p2.m2_toMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        // toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)
        Map<Integer, String> map1 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i % 5,
                        i -> String.format("%d", i),
                        (a, b) -> String.join(", ", a, b)
                ));
        System.out.println(map1);

        System.out.println("---------- toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier mapFactory) ----------");
        Map<Integer, String> map2 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i % 5,
                        i -> String.format("%d", i),
                        (a, b) -> String.join(", ", a, b),
                        LinkedHashMap::new
                ));
        System.out.println(map2);
    }
}
