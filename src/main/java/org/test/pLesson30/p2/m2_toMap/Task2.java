package org.test.pLesson30.p2.m2_toMap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> map = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        Function.identity(),
                        a -> (a % 2 == 0) ? "even" : "odd")
                );
        System.out.println(map);
    }
}
