package com.test.lesson17.p2;

import java.util.ArrayList;
import java.util.Collection;

public class ExampleCollectionMethods {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList();
        System.out.println("size before add = " + list1.size());
        System.out.println("isEmpty - " + list1.isEmpty());

        list1.add(1);
        list1.add(-5);
        list1.add(13);
        list1.add(2);
        System.out.println("list1 - " + list1);

//        for (Integer integer : list1) {
//            System.out.print(integer + " ");
//        }

//        list1.clear();
//        System.out.println("size after clear = " + list1.size());
//        System.out.println("isEmpty - " + list1.isEmpty());

        System.out.println("list1 contain '10' - " + list1.contains(10));
        System.out.println("list1 contain '13' - " + list1.contains(13));


        Collection<Integer> list2 = new ArrayList();
        list2.add(1);
        list2.add(-10);
        list2.add(3);
        System.out.println("list2 - " + list2);

        list1.addAll(list2);
        System.out.println("list1 after addAll list2 - " + list1);

//        list1.removeAll(list2);
//        System.out.println("after removeAll - " + list1);

//        list1.retainAll(list2);
//        System.out.println("after retainAll - " + list1);


        System.out.println("list1 contain '5' - " + list1.contains(5));
        System.out.println("list1 contain '-5' - " + list1.contains(-5));


        System.out.println("element at index 1 - " + list1.toArray()[1]);


    }
}
