package com.test.lesson15.p4;

public abstract class Person {

    protected String name;

    protected String id;


    public abstract String getId();

    public abstract String getName();

    public abstract void sayHello();

    public void printId() {
        System.out.println(id + " ");
    }

    static void thisMethod () {
        System.out.println();
    }

}
