package com.test.pLesson26.p2;

interface EqualFunction {
    String getHighNumber(int a, int b);
}

public class EqualNumbers {
    public static void main(String[] args) {
        EqualFunction function = (a, b) -> {
            if (a > b) {
                return "First number is greater";
            } else {
                return "Second number is greater";
            }
        };

        System.out.println(function.getHighNumber(5, 9));
    }
}

