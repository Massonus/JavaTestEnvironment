package org.test.pLesson35.p2;

import org.test.pLesson35.p2.entity.Cat;

import java.lang.reflect.Field;

public class p4_getField {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Cat> catClass = Cat.class;

        System.out.println("===== getFields =====");
        Field[] fields = catClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }

        System.out.println("===== getDeclaredFields =====");
        Field[] declaredFields = catClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field.getName());
        }

    }
}
