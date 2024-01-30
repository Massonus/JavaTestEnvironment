package com.test.Test7;

public class Main {

    public static void main(String[] args) {
        String string = "My, His, is,: ol";

        String[] strings = string.split(", ");

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
