package com.test.pLesson30.p2.m9_realizeCollector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collector;

public class NumberClassificator implements Collector<Integer, List<Integer>, List<Integer>> {
    private Predicate<Integer> addORNot;

    public NumberClassificator(Predicate<Integer> addORNot) {
        super();
        this.addORNot = addORNot;
    }

    @Override
    public Supplier<List<Integer>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Integer>, Integer> accumulator() {
        return (a, b) -> {
            if (addORNot.test(b)) {
                a.add(b);
            }
        };
    }

    @Override
    public BinaryOperator<List<Integer>> combiner() {
        return (a, b) -> {
            List<Integer> result = new ArrayList<>();
            result.addAll(a);
            result.addAll(b);
            return result;
        };
    }

    @Override
    public Function<List<Integer>, List<Integer>> finisher() {
        return a -> {
            List<Integer> sortedList = new ArrayList<>();
            sortedList.addAll(a);
            Collections.sort(sortedList);
            return sortedList;
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 0, -10, 5, -7, 8, 3);

        Predicate<Integer> predicate = a -> a > 0;

        Collector<Integer, List<Integer>, List<Integer>> collector = new NumberClassificator(predicate);

        List<Integer> result = numbers.stream().collect(collector);

        System.out.println(result);
    }
}
