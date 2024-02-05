package com.test.Tests;

public class StringSplitExample {

    public static void main(String[] args) {
        String string = "My, His, is,: ol";

        String[] strings = string.split(", ");

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
