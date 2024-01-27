package org.test.pLesson40_tests;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

    }

    public static List<Integer> getList (final Collection<Integer> integerCollection) {
        final Set<Integer> result1 = new HashSet<>();
        integerCollection.forEach(i -> {
            if (i > 2) {
                result1.add(i);
            }
        });

        final List<Integer> result = new ArrayList<>(result1);

        return result;
    }

    public static List<Integer> getListMy (final Collection<Integer> integerCollection) {

        return integerCollection.stream()
                .distinct()
                .filter(i -> i > 2)
                .collect(Collectors.toList());
    }

}
