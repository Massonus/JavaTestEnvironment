package org.test.lesson17.p2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExampleIterator {
    public static void main(String[] args) {
       Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-5);
        list.add(13);
        list.add(4);
        list.add(7);
        list.add(-3);

        System.out.println("list1 - " + list);

        System.out.print("iterator foreach - ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next() > 10)
                iterator.remove();
        }

        System.out.println("\nafter iterator - " + list);
    }
}
