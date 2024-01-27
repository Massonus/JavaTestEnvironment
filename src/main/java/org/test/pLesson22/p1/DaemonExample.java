package org.test.pLesson22.p1;

public class DaemonExample extends Thread{
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " - " + i);
                        sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " - " + i);
                        sleep(1000);
                        if (i == 4){
                            thread1.join();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.setDaemon(true);

        thread1.start();
        thread2.start();
    }

}
