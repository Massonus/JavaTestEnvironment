package com.test.pLesson28.p2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        final List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(9);
        integerList.add(9);
        integerList.add(8);
        integerList.add(10);

 /*       integerList.stream().filter(integer -> integer % 2 ==0).forEach(integer -> System.out.println(integer));*/

        /*integerList.stream().limit(3).forEach(integer -> System.out.println(integer));*/

       /* integerList.stream().skip(3).forEach(integer -> System.out.println(integer));*/


        /*integerList.stream().dropWhile(integer -> integer % 2 !=0).forEach(integer -> System.out.println(integer));*/

        /*integerList.stream().takeWhile(integer -> integer % 2 !=0).forEach(integer -> System.out.println(integer));*/

        integerList.stream().dropWhile(integer -> integer % 2 == 0).forEach(integer -> System.out.println(integer));

        final List<Integer> collect = integerList.stream().dropWhile(integer -> integer % 2 == 0).collect(Collectors.toList());

        List<Integer> integerList1 = new ArrayList<>();

        integerList.stream().limit(10).forEach(i -> {
            List<Integer> arrayList = new ArrayList<>();
            arrayList.add(i);
        });

    }

}
