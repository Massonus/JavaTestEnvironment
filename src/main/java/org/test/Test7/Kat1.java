package org.test.Test7;

import java.util.Arrays;

public class Kat1 {
    public static void main(String[] args) {
        /*System.out.println(reverseString("draw"));*/
        /*Integer i = convertFromStringToInt("1564");
        System.out.println(i);*/
        /*Object[] con = {"hay", "junk", "hay", "hay", true, "moreJunk", "needle", "randomJunk", 3};
        String needle = findNeedle(con);
        System.out.println(needle);*/
        /*int[] some = {3,7,3,2,57,0};
        System.out.println(find_average(some));*/
        /*digitize(2463);*/
        /* isPowerOfThree(45);*/
        int[] some = {3, 7, 3, 2, 57};
        /*System.out.println(grow(some));*/

    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static Integer convertFromStringToInt(String str) {
        return Integer.parseInt(str);

    }

    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                index = i;
            }
        }
        return "found the needle at position " + index;
    }

    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);
    }

    public static void digitize(long n) {
        int[] array = new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();

    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            System.out.println("There is no x where 3x = " + n);
            return false;
        }
        System.out.println(n + " = " + Math.pow(n, 3));
        return true;
    }

    public static String numberToString(int num) {
        return "" + num;
    }
}
