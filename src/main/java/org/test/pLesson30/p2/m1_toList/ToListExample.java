package org.test.pLesson30.p2.m1_toList;



import org.test.pLesson30.p2.entity.Ingredient;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListExample {
    public static void main(String[] args) {
        System.out.println("----------  toCollection(Supplier collectionFactory) ----------");
        Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(deque);

        Set<Integer> set = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(set);

        System.out.println("----- toList ------");
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list);



        List<Ingredient> products = List.of(
                new Ingredient("Milk", 200),
                new Ingredient("Butter", 100),
                new Ingredient("Bread", 250),
                new Ingredient("Cheese", 100)
        );

        List<String> productsName = products.stream()
                .filter(a -> a.getAmount() > 100)
                .collect(ArrayList::new, (a, b) -> a.add(b.getName()), (a, b) -> a.addAll(b));
        System.out.println(productsName);


    }
}
