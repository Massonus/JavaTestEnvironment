package com.test.lesson13.p1;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "Dog";
        String s2 = "Dog";
        String s3 = new String("Dog");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

//        s2 = s3;
//        System.out.println(s1 == s2);
//
//
//        String hello = "hello";
//        System.out.println(s1.compareTo(hello));

    }
}
