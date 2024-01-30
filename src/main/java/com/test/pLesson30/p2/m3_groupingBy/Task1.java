package com.test.pLesson30.p2.m3_groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<String, List<Integer>> result = numbers.stream()
                .collect(Collectors
                        .groupingBy(a -> (a % 2 == 0) ? "even" : "add"));

        System.out.println(result);
    }
}
