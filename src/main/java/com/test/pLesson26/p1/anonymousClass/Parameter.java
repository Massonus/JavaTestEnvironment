package com.test.pLesson26.p1.anonymousClass;

public class Parameter {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Child Thread");
            }
        });

        thread.start();

        System.out.println("Main Thread");
    }
}
