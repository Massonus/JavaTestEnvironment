package org.test.pLesson26.p1.anonymousClass;

public class ImplementInterface {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Child Thread");
            }
        };

        Thread thread = new Thread(r);
        thread.start();

        System.out.println("Main Thread");
    }
}
