package com.test.pLesson40_tests;

public class PrimeNumberCheck {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        if (isPrime(num)) {
            System.out.println(num + " просте.");
        } else {
            System.out.println(num + " не просте.");
        }
    }

}
