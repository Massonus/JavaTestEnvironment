package org.test.lesson19.p2;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        System.out.println(set);

        //ceiling
        set.remove(5);
        System.out.println(set);
        System.out.println("ceiling '5' - " + set.ceiling(5));

        //floor
        System.out.println("floor '5' - " + set.floor(5));

        //headSet
        System.out.println(set.headSet(3));
        System.out.println(set.headSet(3, true));

        System.out.println(set.tailSet(2, false));


    }
}
