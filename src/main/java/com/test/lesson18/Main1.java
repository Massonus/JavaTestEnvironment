package com.test.lesson18;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main1 {

    public static void main(String[] args) {

        Flower flower = new Flower(0, "red");
        Flower flower1 = new Flower(1, "blue");
        Flower flower2 = new Flower(2, "black");

        Flower flower3 = new Flower(3, "list");

        final List<Flower> flowerList = new LinkedList<>();
        flowerList.add(flower);
        flowerList.add(flower1);
        flowerList.add(flower2);

/*        flowerList.clear();*/

        final boolean empty = flowerList.isEmpty();

        System.out.println(empty);

        flowerList.set(0, flower3);

        final int i = flowerList.indexOf(flower2);

        System.out.println(i);

        final Flower flower5 = flowerList.get(1);
        final int id = flower5.getId();

        final int size = flowerList.size();

        System.out.println(size);

  /*      for (Flower flower4 : flowerList) {
            System.out.println(flower4);
        }*/


        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Cat");
        stringLinkedList.add("Dog");
        stringLinkedList.add("Frog");

        final String last = stringLinkedList.getLast();

        System.out.println(last);
        System.out.println(stringLinkedList.getFirst());


        final ListIterator<Flower> flowerListIterator = flowerList.listIterator();

        while (flowerListIterator.hasNext()) {
            final Flower next = flowerListIterator.next();
            if (next.getId() == 2) {
                flowerListIterator.remove();
            }
        }


        for (Flower s : flowerList) {
            System.out.println(s);
        }


    }

}
