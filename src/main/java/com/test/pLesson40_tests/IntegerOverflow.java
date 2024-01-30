package com.test.pLesson40_tests;

public class IntegerOverflow {


    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int miValue = Integer.MIN_VALUE;
        int overflow = maxValue + 1;
        int overflow1 = miValue - 1;
        System.out.println("MAX: " + maxValue);
        System.out.println("MIN: " + miValue);
        System.out.println("Over: " + overflow);
        System.out.println("Over1: " + overflow1);
    }


}
