package org.test.lesson20.p1;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> wordNumber = new LinkedHashMap<>(5, 0.75F,true);
        wordNumber.put("one", 1);
        wordNumber.put("two", 2);
        wordNumber.put("three", 3);
        wordNumber.put("four", 4);

        System.out.println("before get");
        System.out.println(wordNumber);

        wordNumber.get("one");

        System.out.println("after get key=one");
        System.out.println(wordNumber);

        wordNumber.get("four");

        System.out.println("after get key=four");
        System.out.println(wordNumber);
    }
}
