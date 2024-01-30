package com.test.lesson15.p2;

public class Cat extends Animal {

    @Override
    void sayHello() {
        System.out.println("mew");
    }

    public void printName(final String name) {
        System.out.println(name);
    }
}
