package com.test.lesson20.p1;

import com.test.lesson19.p1.Color;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    public static void main(String[] args) {
        Map colorsMap = new EnumMap(Color.class);
        colorsMap.put(Color.GREEN, "grass");
        colorsMap.put(Color.BLUE, "ocean");
        colorsMap.put(Color.WHITE, "snow");
        colorsMap.put(Color.RED, "apple");

        System.out.println(colorsMap.keySet());
    }
}
