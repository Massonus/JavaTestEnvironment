package com.test.lesson19.p2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set1 = new TreeSet<>();
        set1.add("orange");
        set1.add("kiwi");
        set1.add("apple");
        set1.add("strawberry");
        set1.add("mango");

        System.out.println(set1);

        System.out.println(set1.headSet("mango"));

        System.out.println(set1.subSet("kiwi", "orange"));

        System.out.println(set1.tailSet("mango"));
    }
}
