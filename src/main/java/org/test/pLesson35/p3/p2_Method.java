package org.test.pLesson35.p3;

import org.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Method;

public class p2_Method {
    public static void main(String[] args) throws NoSuchMethodException {
        Cat cat = new Cat();
        Class catClass = cat.getClass();
        Method privateMethod = catClass.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);

        System.out.println(privateMethod.toGenericString());

    }
}
