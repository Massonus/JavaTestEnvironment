package com.test.pLesson30.p2.m6_filteringResult;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> language = List.of("Java", "Python");

        Function<String, Stream<String>> mapper = a -> Arrays.stream(a.split(""));
        BinaryOperator<Integer> mergeFunc = (a, b) -> a + b;

        Collector<String, ?, Map<String, Integer>> downstream = Collectors
                .toMap(Function.identity(), a -> 1, mergeFunc);

        Map<String, Integer> resultFlatmap = language.stream()
                .collect(Collectors
                        .flatMapping(mapper, downstream));
        System.out.println(resultFlatmap);

    }
}
