package com.test.pLesson35.p4.ex2;

public class Test {
    @MyAnnotation(priority = 1)
    public static void method1(){
        System.out.println("method1");
    }

    @MyAnnotation(priority = 5)
    public static void method2(){
        System.out.println("method2");
    }

    @MyAnnotation(priority = 2)
    public static void method3(){
        System.out.println("method3");
    }
}
