package com.test.lesson15.p4;

public interface AboutPerson {

    void setId(String id);

    void setName(String name);

    default void say () {
        System.out.println("hello");
    }

}
