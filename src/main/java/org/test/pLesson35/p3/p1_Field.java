package org.test.pLesson35.p3;

import org.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class p1_Field {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat = new Cat(10,20,30);
        Class catClass = cat.getClass();
        Field publicField = catClass.getDeclaredField("publicField");
        Field defaultField = catClass.getDeclaredField("defaultField");
        Field privateField = catClass.getDeclaredField("privateField");

        System.out.println(publicField.get(cat));
//        System.out.println(defaultField.get(cat));
//        System.out.println(privateField.get(cat));

        defaultField.setAccessible(true);
        privateField.setAccessible(true);
        System.out.println(defaultField.get(cat));
        System.out.println(privateField.get(cat));

        System.out.println("\n===== getType =====");
        Class<?> type = privateField.getType();
        System.out.println("getType private field" + type);

        System.out.println("\n===== getModifiers =====");
        int modifiers = privateField.getModifiers();
        System.out.println("isPrivate : " + Modifier.isPrivate(modifiers));
        System.out.println("isFinal   : " + Modifier.isFinal(modifiers));
        System.out.println("getModifiers field as bit : " + modifiers);
        System.out.println("                as String : " + Modifier.toString(modifiers));
    }
}
