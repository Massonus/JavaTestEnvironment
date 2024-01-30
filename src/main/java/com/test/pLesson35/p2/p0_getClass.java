package com.test.pLesson35.p2;

public class p0_getClass {
    public static void main(String[] args) {
        Class stringClass1 = "Java".getClass();
        System.out.println(stringClass1);

        Class stringClass2 = String.class;
        System.out.println(stringClass2);

        try {
            Class stringClass3 = Class.forName("java.lang.String");
            System.out.println(stringClass3);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
