package com.test.lesson20.p2;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> wordNumber = new TreeMap<>();
        wordNumber.put("one", 1);
        wordNumber.put("two", 2);
        wordNumber.put("three", 3);
        wordNumber.put("four", 4);
        System.out.println(wordNumber + " - main Map");

        System.out.println(wordNumber.firstKey() + " - firstKey");
        System.out.println(wordNumber.lastKey() + " - lastKey");
        System.out.println(wordNumber.headMap("ten") + " - headMap");
        System.out.println(wordNumber.subMap("one", "three") + " - subMap");
        System.out.println(wordNumber.tailMap("one") + " - tailMap");


        TreeMap<String, Integer> copyWithComparator = new TreeMap<>(new ComparatorByWordLength());
        copyWithComparator.putAll(wordNumber);
        System.out.println(copyWithComparator + " - copyWithComparator");




    }
}
