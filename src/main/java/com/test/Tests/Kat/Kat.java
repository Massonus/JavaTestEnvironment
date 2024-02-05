package com.test.Tests.Kat;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Kat {
    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1, 1, 6, 3, 12, 8);
        List<Integer> list1 = getList(list);
        System.out.println(list1);*/
        int[] array = {1, 2, 2};
        int i = squareSum(array);
        reverseString1("Hurry");
        /*System.out.println(reverseString2("draw"));*/
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

    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(operand -> (int) Math.pow(operand, 2))
                .sum();
    }

    public static String reverseString1(String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        String s = new String(reverse);
        System.out.println(s);
        return s;
    }

    public static String reverseString2(String str) {
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

    public static List<Integer> getList(Collection<Integer> collection) {
        return collection.stream()
                .distinct()
                .filter(integer -> integer > 2)
                .collect(Collectors.toList());
    }
}
