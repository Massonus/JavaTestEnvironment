package com.test.init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);

        ctx.close();
    }
}
