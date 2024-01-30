package com.test.pLesson30.p2.m3_groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(String::length));

        map.entrySet().forEach(System.out::println);
    }
}
