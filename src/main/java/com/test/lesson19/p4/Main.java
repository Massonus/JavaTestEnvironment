package com.test.lesson19.p4;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

      /*  List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        integerList.add(null);

        System.out.println("list " + integerList);

        final Set<String> integerSet = new HashSet<>();
        integerSet.add("true");
        integerSet.add("true");
        integerSet.add("true");
        integerSet.add("false");
        integerSet.add(null);

        System.out.println("set " + integerSet);*/

        final Set<Pocket> pockets = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            Pocket pocket = new Pocket(1, "Pocket");
            pockets.add(pocket);
        }

        for (Pocket pocket : pockets) {
            System.out.println(pocket);
        }

        System.out.println("size " + pockets.size());


    }

}
