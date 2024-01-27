package org.test.pLesson35.p3;

import org.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.InvocationTargetException;

public class p3_Constructor {
    public static void main(String[] args) {
        try {
            Cat cat = Cat.class.getConstructor(int.class, int.class, int.class).newInstance(1, 2, 3);
            System.out.println(cat);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
