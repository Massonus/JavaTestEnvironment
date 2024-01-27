package org.test.pLesson22.p2;

public class DeadLockExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    private static class Thread1 extends Thread{
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread1 hold lock1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread1 wait for lock2");

                synchronized (lock2){
                    System.out.println("Thread1 hold lock2");
                }
            }
        }
    }

    private static class Thread2 extends Thread{
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Thread2 hold lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread2 wait for lock1");

                synchronized (lock1){
                    System.out.println("Thread2 hold lock1");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.start();
        thread2.start();
    }
}
