package org.test.pLesson40_tests;

public class StringComparison {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1 == str2) {
            System.out.println("Рівні");
        } else {
            System.out.println("Не рівні");
        }
    }

}
