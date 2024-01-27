package org.test.pLesson30.p3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class task2 {
    public static void main(String[] args) {
        Supplier<List<Integer>> supplier = ArrayList::new;

        BiConsumer<List<Integer>, Integer> accumulator = (a, b) -> a.add(b);

        BinaryOperator<List<Integer>> combiner = (a, b) -> {
            List<Integer> result = Collections.synchronizedList(new ArrayList<>());
            result.addAll(a);
            result.addAll(b);
            return result;
        };

        Function<List<Integer>, List<Integer>> finisher = Function.identity();

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> result = numbers.parallelStream()
                .filter(a -> a % 2 == 0)
                .collect(Collector.of(supplier, accumulator, combiner, finisher, Collector.Characteristics.CONCURRENT));

        System.out.println(result);

    }
}
