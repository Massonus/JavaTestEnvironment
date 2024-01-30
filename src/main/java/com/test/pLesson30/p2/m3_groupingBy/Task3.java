package com.test.pLesson30.p2.m3_groupingBy;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
// groupingBy(Function classifier, Collector downstream)
        Map<Integer, String> map = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.joining())
                ));

        map.entrySet().forEach(System.out::println);
    }
}
