package org.test.lesson13.p3;

import java.util.regex.Pattern;

public class PatterMethods {
    public static void main(String[] args) {

        String text = "abc";

        //method pattern
        Pattern pattern = Pattern.compile("abc");
        System.out.println(pattern.pattern());

        //method matches
        System.out.println(Pattern.matches("abc", text));

        //method matcher
//        System.out.println(pattern.matcher(text));

        //method flags
//        System.out.println(pattern.flags());
//        Pattern pattern2 = Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
//        System.out.println(pattern2.flags());

    }
}
