package com.test.lesson15.p4;

public interface AboutWorker {

    void about();

    default void aboutThisWorker (String s) {
        System.out.println(s);
    }

    static void hello() {
        System.out.println("Hello");
    }

}
