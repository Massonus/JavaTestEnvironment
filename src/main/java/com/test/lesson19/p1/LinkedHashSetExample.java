package com.test.lesson19.p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("orange");
        set1.add("kiwi");
        set1.add("apple");
        set1.add("strawberry");
        set1.add("mango");

        System.out.println("set - " + set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("strawberry");
        set2.add("orange");
        set2.add("kiwi");
        set2.add("apple");
        set2.add("mango");

        System.out.println("set2 - " + set2);

    }
}
