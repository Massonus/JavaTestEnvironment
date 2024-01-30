package com.test.pLesson40_tests;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static Integer[] findDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int num : arr) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        System.out.println("Д: " + duplicateElements);
        Integer[] array = uniqueElements.toArray(new Integer[0]);
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 2, 5, 6, 3, 4};
        Integer[] duplicates = findDuplicates(numbers);
        for (Integer duplicate : duplicates) {
            System.out.println(duplicate);
        }
    }
}
