package com.test.lesson18;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        final List<Integer> integers = List.of(1, 2, 3, 4, 7, 6, 8);
        /*        integers.add(97);*/

        final List<Integer> bigList = new ArrayList<>();
        bigList.add(1);
        bigList.add(2);
        bigList.add(3);
        bigList.add(4);

        final List<Integer> integers1 = List.copyOf(bigList);
        /*integers1.add(7);*/

        for (Integer integer : integers1) {
            System.out.println(integer);
        }


    }

}
