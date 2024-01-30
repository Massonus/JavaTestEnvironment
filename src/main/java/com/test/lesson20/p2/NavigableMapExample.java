package com.test.lesson20.p2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
    public static void main(String[] args) {
        NavigableMap<String, Integer> wordNumber = new TreeMap<>();
        wordNumber.put("one", 1);
        wordNumber.put("two", 2);
        wordNumber.put("three", 3);
        wordNumber.put("four", 4);
        System.out.println(wordNumber + " - main Map");

        System.out.println("if map contains key=ten with value=10");
        System.out.println(wordNumber.ceilingEntry("ten") + " - ceilingEntry");
        System.out.println(wordNumber.floorEntry("ten") + " - floorEntry");
        System.out.println(wordNumber.floorKey("ten") + " - floorKey");
        System.out.println(wordNumber.headMap("ten") + " - headMap");
        System.out.println(wordNumber.higherEntry("ten") + " - higherEntry");
        System.out.println(wordNumber.lowerEntry("ten") + " - lowerEntry");
        System.out.println(wordNumber.higherKey("ten") + " - higherKey");
        System.out.println(wordNumber.lowerKey("ten") + " - lowerKey");
        System.out.println(wordNumber.lastEntry() + " - lastEntry");
        System.out.println(wordNumber.lastEntry() + " - lastEntry");
        wordNumber.put("ten", 10);
        System.out.println(wordNumber + " - after add key=ten\n");

        System.out.println(wordNumber.ceilingKey("ten") + " - next key if map contains key=ten");
        System.out.println(wordNumber.descendingKeySet() + " - descendingKeySet");
        System.out.println(wordNumber.descendingMap() + " - descendingMap");
        System.out.println(wordNumber.firstEntry() + " - firstEntry");
        System.out.println(wordNumber.lastEntry() + " - lastEntry");

        System.out.println(wordNumber.tailMap("one" + " - tailMap from key=one"));




    }

}
