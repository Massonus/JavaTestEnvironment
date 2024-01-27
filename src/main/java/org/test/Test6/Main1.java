package org.test.Test6;

import java.util.LinkedList;

public class Main1 {

    public static void main(String[] args) {

        LinkedList<Integer> integerList = new LinkedList<>();

        for (int i = 0; i < 200001; i++) {
            integerList.add(i);
        }
        /*System.out.println(integerList.get(16000));*/
        System.out.println(integerList.getLast());
    }
}
