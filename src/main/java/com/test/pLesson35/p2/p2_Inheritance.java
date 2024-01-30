package com.test.pLesson35.p2;


import com.test.pLesson35.p2.entity.Cat;

public class p2_Inheritance {
    public static void main(String[] args) {
        Class classCat = Cat.class;

        System.out.println("getSuperclass        : " + classCat.getSuperclass());
        System.out.println("getGenericSuperclass : " + classCat.getGenericSuperclass());

        System.out.println("===== getInterfaces  ======");
        Object[] interfaces = classCat.getInterfaces();
        for (Object anInterface : interfaces) {
            System.out.println(anInterface);
        }

        System.out.println("===== getGenericInterfaces  ======");
        Object[] genericInterfaces = classCat.getGenericInterfaces();
        for (Object anInterface : genericInterfaces) {
            System.out.println(anInterface);
        }
    }

}
