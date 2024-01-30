package com.test.pLesson26.p1.anonymousClass;

public class ExtendClass {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Child Thread");
            }
        };

        thread.start();
        System.out.println("Main Thread");
    }
}
