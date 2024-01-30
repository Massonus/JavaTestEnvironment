package com.test.pLesson35.p2;

import com.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Method;

public class p4_getMethod {
    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;

        System.out.println("===== getMethods =====");
        Method[] methods = catClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("===== getDeclaredMethods =====");
        Method[] declaredMethods = catClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
    }
}
