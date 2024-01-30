package com.test.lesson13.p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethods {
    public static void main(String[] args) {

        String text = "abc123 abc bbc cbc ccc";
         Pattern pattern = Pattern.compile("(\\w+)");
        Matcher matcher = pattern.matcher(text);

        //method find, start, end
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Found a match - " + text.substring(start, end) + " from index " + start + " to " + (end - 1));
            System.out.println(matcher.group());
        }
        System.out.println(matcher.groupCount());


    }
}
