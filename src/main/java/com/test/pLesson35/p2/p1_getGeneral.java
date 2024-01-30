package com.test.pLesson35.p2;

import com.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Modifier;

public class p1_getGeneral {
    public static void main(String[] args) {
        Class<Cat> classCat = Cat.class;

        System.out.println("getModule      : " + classCat.getModule());
        System.out.println("getPackage     : " + classCat.getPackage());
        System.out.println("getPackageName : " + classCat.getPackageName());
        System.out.println("getTypeName    : " + classCat.getTypeName());
        System.out.println("getModifiers   : " + Modifier.toString(classCat.getModifiers()));

        System.out.println();

        System.out.println("getName          : " + classCat.getName());
        System.out.println("getCanonicalName : " + classCat.getCanonicalName());
        System.out.println("getSimpleName    : " + classCat.getSimpleName());
        System.out.println("toGenericString  : " + classCat.toGenericString());
    }
}
