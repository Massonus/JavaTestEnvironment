package com.test.pLesson35.p4.ex1;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Mammal {
    String sound();
    int color();
}
