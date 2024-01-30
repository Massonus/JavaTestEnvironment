package com.test.pLesson40_tests;

import java.util.Arrays;

public class MaxNumberInArray {

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMaxs(int[] arr) {
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        int maxNumber = findMax(numbers);
        System.out.println("Найбільше: " + maxNumber);
        int maxs = findMaxs(numbers);
        System.out.println(maxs);
    }

}
