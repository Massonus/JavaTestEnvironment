package org.test.lesson20.p1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> wordNumber = new HashMap<>();
        wordNumber.put("one", 1);
        wordNumber.put("two", 2);
        wordNumber.put("three", 3);
        wordNumber.put("four", 4);
        System.out.println(wordNumber + " - main Map");


     /*   Set<Map.Entry<String, Integer>> numbers = wordNumber.entrySet();
        for (Map.Entry<String, Integer> number : numbers) {
            System.out.print(number.getValue() + " ");
        }*/
        System.out.println();

    /*   Integer v1 = wordNumber.compute("one", (k, v) -> v + 1);
        System.out.println(wordNumber + " - compute key=one, value=" + v1);
        Integer v2 = wordNumber.compute("five", (k, v) -> 5 + 1);
        System.out.println(wordNumber + " - compute key=five, value=" + v2);*/


      /* Integer v1 = wordNumber.computeIfAbsent("one", v -> 1 + 1);
       System.out.println(wordNumber + " - computeIfAbsent key=one, value=" + v1);
        Integer v2 = wordNumber.computeIfAbsent("five", v -> 4 + 1);
        System.out.println(wordNumber + " - computeIfAbsent key=five, value=" + v2);*/


      /*  Integer v1 = wordNumber.computeIfPresent("five", (k, v) -> v + 1);
        System.out.println(wordNumber + " - computeIfPresent key=five, value=" + v1);
        Integer v2 = wordNumber.computeIfPresent("one", (k, v) -> v + 1);
        System.out.println(wordNumber + " - computeIfPresent key=one, value=" + v2);*/

        System.out.println(wordNumber.putIfAbsent("four", 2) + " - putIfAbsent");
        System.out.println(wordNumber.replace("21", 2, 3));     //false
        System.out.println(wordNumber);
    }
}
