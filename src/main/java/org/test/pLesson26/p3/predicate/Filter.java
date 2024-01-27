package org.test.pLesson26.p3.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static <T> List<T> filter(List<T> list, Predicate<T> func) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (func.test(t)) {
                result.add(t);
            }

        }
        return result;
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<String> result = filter(list, a -> a.startsWith("A"));
        System.out.println(result);

        result = filter(list, a -> a.startsWith("A") || a.length() == 3);
        System.out.println(result);

        List<Integer> numbers = filter(list2, a -> a > 4);
        System.out.println(numbers);

        System.out.println("----------------------");

        Predicate<Integer> func1 = a -> a > 2;
        Predicate<Integer> func2 = a -> a < 6;

        numbers = filter(list2, func1.and(func2));
        System.out.println("and - " + numbers);

        numbers = filter(list2, func1.or(func2));
        System.out.println("or - " + numbers);

        numbers = filter(list2, func1.negate());
        System.out.println("negate - " + numbers);

    }
}
