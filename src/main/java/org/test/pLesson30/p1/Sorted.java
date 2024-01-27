package org.test.pLesson30.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorted {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9, 1);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted numbers");

        sortedNumbers.forEach(System.out::println);

        List<Integer> reverseSortedNumbers = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println("Sorted rev numbers");

        reverseSortedNumbers.forEach(System.out::println);

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        numbers.stream()
                .map(n -> reverseSortedNumbers.stream().filter(s -> s == n))
                .collect(Collectors.toList());

        List<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(numbers);
        numbers2.addAll(reverseSortedNumbers);

        List<String> numbers3 = new ArrayList<>();
        final List<List<Integer>> collect = Stream.of(numbers, numbers).collect(Collectors.toList());
    }

}
