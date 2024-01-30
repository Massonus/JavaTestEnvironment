package com.test.pLesson22.p1;

public class TheadMethods {
    public static void main(String[] args) {
        System.out.println("Count of active threads - " + Thread.activeCount());
        Thread.currentThread().getThreadGroup().list();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();
                thread.getThreadGroup().list();
                System.out.println(thread.getName() + " getId - " + thread.getId());
                System.out.println("Count of active threads - " + Thread.activeCount());
                System.out.println(thread.getName() + " State: " + thread.getState());

                System.out.println("holdsLock - 'thread' - " + Thread.holdsLock(thread));
                System.out.println(thread.getName() + " isAlive - " + thread.isAlive());
                System.out.println(thread.getName() + " isDaemon - " + thread.isDaemon());
                System.out.println(thread.getName() + " isInterrupted - " + thread.isInterrupted());

                System.out.println();
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " - " + i);
                        if (i == 3){
                            thread.interrupt();
                            System.out.println(thread.getName() + " interrupt");
                            System.out.println(thread.getName() + " isInterrupted - " + thread.isInterrupted());
                        }
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        System.out.println("\nCreate " + thread1.getName() + " State: " + thread1.getState());
        System.out.println("Count of active threads before start new - " + Thread.activeCount());

        thread1.start();
        System.out.println("Start " + thread1.getName());


    }
}
