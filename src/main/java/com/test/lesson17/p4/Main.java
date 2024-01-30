package com.test.lesson17.p4;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        String s = "test";
        String s1 = "test1";
        collection.add(s);
        collection.add(s1);

        Collection<String> collection2 = new ArrayList<>();
        String s2 = "test2";
        String s3 = "test3";
        collection2.add(s2);
        collection2.add(s3);

        collection.addAll(collection2);

/*        System.out.println(collection);

        collection.retainAll(collection2);

        collection.removeAll(collection2);

        System.out.println(collection);*/

   /*     final boolean test3 = collection.containsAll(collection2);*/

        collection.clear();

        System.out.println(collection);

        final boolean empty = collection.isEmpty();

        System.out.println(empty);


      /*  Collection<Printer> collection1 = new ArrayList<>();
        Printer printer = new Printer(0, "Xerox");
        Printer printer1 = new Printer(1, "Sumsung");
        collection1.add(printer);
        collection1.add(printer1);




        for (Printer printer2 : collection1) {
            System.out.println(printer2.getId());
        }*/


  /*      final Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/


       /* System.out.println(collection);
        System.out.println(collection1);*/
    }

}
