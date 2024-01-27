package org.test.pLesson40_tests;

public class StringMutability {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" world");

        System.out.println(str);
    }

}
