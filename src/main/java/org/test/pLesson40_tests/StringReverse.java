package org.test.pLesson40_tests;

public class StringReverse {

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversedString = reverse(original);
        System.out.println("Реверс: " + reversedString);
    }

}
