package com.test.lesson19.p1;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    public static void main(String[] args) {
        Set<Color> colorSet = EnumSet.allOf(Color.class);

        for (Color color : colorSet) {
            System.out.println(color);
        }



    }
}
