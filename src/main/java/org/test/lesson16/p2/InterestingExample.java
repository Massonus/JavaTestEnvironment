package org.test.lesson16.p2;

public class InterestingExample {
    private static int method1() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }

    private static void method2() {
        try {
            System.out.println("try");
//            System.exit(0);
        } finally {
            System.out.println("finally");
        }
    }

    private static void method3() {
        try {
            int c = 2 / 0;
            System.out.println(c);
        } finally {
            String s = null;
            System.out.println(s.length());
        }
    }

    private static void method4() {
        try {
            int c = 2 / 0;
            System.out.println(c);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Invalid argument");
        }
    }

    private static void method5() {
        try {
            int c = 2 / 0;
            System.out.println(c);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Invalid argument", e);
//            throw new IllegalArgumentException("Invalid argument");
        }
    }

    public static void main(String[] args) {
        System.out.println(InterestingExample.method1());
//        InterestingExample.method2();
//        InterestingExample.method3();
//        InterestingExample.method4();
//        InterestingExample.method5();
    }
}
