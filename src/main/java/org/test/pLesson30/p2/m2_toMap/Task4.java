package org.test.pLesson30.p2.m2_toMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Function<Integer, String> keyMapper = a -> (a % 2 == 0) ? "even" : "add";
        Function<Integer, List<Integer>> valueMapper = a -> List.of(a);
        BinaryOperator<List<Integer>> mergeFunction = (a, b) -> {
            List<Integer> result = new ArrayList<>(a);
            result.addAll(b);
            return result;
        };
        Supplier<Map<String, List<Integer>>> mapFactory = HashMap::new;

        Map<String, List<Integer>> result = numbers.stream()
                .collect(Collectors.toMap(
                        keyMapper,
                        valueMapper,
                        mergeFunction,
                        mapFactory));
        System.out.println(result);
    }
}
