package org.test.pLesson35.p2.tasks;

import java.util.ArrayList;

public class Task1 {
    public static void printHierarchy(Class<?> clazz) {
        while (clazz != null) {
            System.out.println(clazz);
            clazz = clazz.getSuperclass();
        }
    }

    public static void main(String[] args) {
        Task1.printHierarchy(ArrayList.class);
    }
}
