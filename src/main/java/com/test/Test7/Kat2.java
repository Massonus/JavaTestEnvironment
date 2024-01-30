package com.test.Test7;

import java.util.*;
import java.util.stream.Collectors;

public class Kat2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1, 6, 3, 12, 8);
        List<Integer> list1 = getList(list);
        System.out.println(list1);
    }

    public static List<Integer> getList(Collection<Integer> collection) {
        return collection.stream()
                .distinct()
                .filter(integer -> integer > 2)
                .collect(Collectors.toList());
    }
}
