package org.test.pLesson30.p2.m3_groupingBy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
// groupingBy(Function classifier, Supplier mapFactory, Collector downstream)
        Map<Integer, List<String>> map = Stream.of("ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.groupingBy(
                        String::length,
                        LinkedHashMap::new,
                        Collectors.mapping(
                                String::toUpperCase,
                                Collectors.toList())
                ));

        map.entrySet().forEach(System.out::println);
    }
}
