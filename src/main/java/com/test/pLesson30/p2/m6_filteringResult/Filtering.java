package com.test.pLesson30.p2.m6_filteringResult;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {
    public static void main(String[] args) {
        System.out.println("---------- filtering() ----------");
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.filtering(
                        x -> x % 2 == 0,
                        Collectors.toList()));

        System.out.println(list);
    }
}
