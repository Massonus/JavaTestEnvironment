package org.test.pLesson26.p3.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static <T> void forEach(List<T> list, Consumer<T> func) {
        for (T t : list) {
            func.accept(t);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        forEach(numbers, x -> System.out.print(x + " "));

        System.out.println();

        Consumer<List<Integer>> increment = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, 1 + list.get(i));
            }
        };

        increment.andThen(System.out::println).accept(numbers);
    }
}
