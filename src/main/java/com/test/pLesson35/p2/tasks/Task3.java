package com.test.pLesson35.p2.tasks;


import com.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Field;

public class Task3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat = new Cat();
        Field field = Cat.class.getDeclaredField("type");
        field.setAccessible(true);
        System.out.println("value     : " + field.get(cat));

        field.set(cat, "DOG");
        System.out.println("new value : " + field.get(cat));
    }
}
