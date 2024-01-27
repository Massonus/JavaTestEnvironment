package org.test.pLesson30.p2.m2_toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        // toMap(Function keyMapper, Function valueMapper)
        Map<Character, String> map = Stream.of(50, 54, 55)
                .collect(Collectors.toMap(
                        i -> (char) i.intValue(),
                        i -> String.format("%d", i)
                ));

        System.out.println(map);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(20.0);
        doubleList.add(21.0);
        doubleList.add(55.0);
        doubleList.add(70.0);

        final Map<String, Integer> collect = doubleList.stream().collect(Collectors.toMap(
                Object::toString,
                Double::intValue
        ));

        System.out.println(collect);

    }
}
