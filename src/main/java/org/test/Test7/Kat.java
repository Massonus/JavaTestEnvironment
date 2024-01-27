package org.test.Test7;

import java.util.Arrays;

public class Kat {

    public static void main(String[] args) {
        int[] array = {1, 2, 2};
        int i = squareSum(array);
        reverseString("Hurry");

    }
    public static int squareSum(int[] n) {
        return Arrays.stream(n)
                .map(operand -> (int) Math.pow(operand, 2))
                .sum();
    }

    public static String reverseString(String str) {
        StringBuilder reverse = new StringBuilder(str);
        reverse.reverse();
        String s = new String(reverse);
        System.out.println(s);
        return s;
    }

}
