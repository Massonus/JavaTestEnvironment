package com.test.lesson12.p5;

public class Main {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.SINGLETON;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());

        Singleton instance = Singleton.getInstance();
        instance.setId(1);
        instance.setName("Name");
        System.out.println(instance);

    }
}
