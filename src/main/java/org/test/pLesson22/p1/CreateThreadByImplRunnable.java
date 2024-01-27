package org.test.pLesson22.p1;

public class CreateThreadByImplRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new CreateThreadByImplRunnable()).start();
        new Thread(new CreateThreadByImplRunnable()).start();
    }
}
