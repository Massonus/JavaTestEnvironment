package org.test.pLesson22.p2;

public class VolatileExample extends Thread {
    /* static int i;*/
    static volatile int i;

    static class ThreadWrite extends Thread{
        @Override
        public void run() {
            while (i < 5){
                System.out.println("increment value to " + (++i));
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class ThreadRead extends Thread{
        @Override
        public void run() {
            int temp = i;
            while (temp < 5){
                if (temp != i){
                    System.out.println("new value = " + i);
                    temp = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        new ThreadRead().start();
        new ThreadWrite().start();
    }

}


