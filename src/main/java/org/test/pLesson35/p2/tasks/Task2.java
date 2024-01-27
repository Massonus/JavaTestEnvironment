package org.test.pLesson35.p2.tasks;


import org.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat();

        Method method = Cat.class.getDeclaredMethod("privateMethodWithParameter", String.class);
        method.setAccessible(true);
        method.invoke(cat, "Tom");
    }
}
