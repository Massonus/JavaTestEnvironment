package com.test.lesson13.p3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantificationMode {

    private static void getResult(String input, Pattern pattern) {
        Matcher matcher = Pattern.compile(String.valueOf(pattern)).matcher(input);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }


    public static void main(String[] args) {
        getResult("Hello World", Pattern.compile("o.+o"));
        System.out.println();
        getResult("Hello World", Pattern.compile("o.++o"));
        System.out.println();
        getResult("Hello World", Pattern.compile("o.+?o"));


    }
}
