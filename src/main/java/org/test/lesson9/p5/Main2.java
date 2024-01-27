package org.test.lesson9.p5;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int [] ints = new int[7];
        ints[0] = 111;
        ints[1] = 133;
        ints[2] = 323;
        ints[3] = 3231;
        ints[4] = 323;
        ints[5] = 1323;
        ints[6] = 3232;

        final int[] ints1 = Arrays.copyOf(ints, ints.length + 10);

        ints1[ints.length] = 11;
        ints1[ints.length + 1] = 11;

       /* final int[] ints1 = Arrays.copyOf(ints, ints.length);

        for (int i = 0; i < ints1.length; i++) {
            int i1 = ints1[i];
            System.out.println(i + " " +  i1);

        }

        final boolean equals = Arrays.equals(ints, ints1);

        System.out.println(equals);*/

        Arrays.sort(ints);

        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }

}
