package org.test.pLesson22.p2;

public class SimpleSync {

    public static void main(String[] args) {
        SimpleSync e1 = new SimpleSync();
        System.out.println("Start");
        new Thread(() -> e1.method1()).start();
        new Thread(() -> e1.method2()).start();
    }

    public synchronized void method1() {
        System.out.println("Method1 start");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Method1 end");
    }

    public synchronized void method2() {
        System.out.println("Method2 start");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Method2 end");
    }
}
