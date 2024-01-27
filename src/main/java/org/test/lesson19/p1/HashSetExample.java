package org.test.lesson19.p1;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static int index(int hashcode) {
        return hashcode & (16 - 1);
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("kiwi");
        set.add("apple");
        set.add("strawberry");
        set.add("mango");

        System.out.println(set.add("apple"));

        set.add("pineapple");   //collision

        System.out.println("element | hashcode | bucket index");
        System.out.println("---------------------------------");
        for (String s : set) {
            System.out.println(s + " | " + s.hashCode() + " | " + HashSetExample.index(s.hashCode()));
        }


    }
}
