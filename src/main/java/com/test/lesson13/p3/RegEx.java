package com.test.lesson13.p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("[a-zA-Z]");
        Pattern pattern2 = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern1.matcher("Hello World");


    }
}
