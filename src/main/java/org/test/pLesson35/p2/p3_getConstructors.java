package org.test.pLesson35.p2;


import org.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Constructor;

public class p3_getConstructors {
    public static void main(String[] args) throws NoSuchMethodException {
        Class classCat = Cat.class;

        System.out.println("===== getConstructors ======");
        Constructor<Cat>[] constructors = classCat.getConstructors();
        for (Constructor<Cat> constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("===== getDeclaredConstructors ======");
        Constructor<Cat>[] constructors2 = classCat.getDeclaredConstructors();
        for (Constructor<Cat> constructor : constructors2) {
            System.out.println(constructor);
        }

        System.out.println("\ngetConstructor : " + classCat.getConstructor());
        System.out.println("getConstructor : " + classCat.getConstructor(int.class, int.class, int.class));
        System.out.println("getDeclaredConstructor : " + classCat.getDeclaredConstructor(int.class));
    }
}
