package org.test.pLesson22.p3;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleLockApp {
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();

        new Thread(() -> {
            System.out.println("thread 1 start");
            lock.lock();
            System.out.println("thread 1 get lock");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("thread 1 end lock");
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("thread 2 start");
            lock.lock();
            System.out.println("thread 2 get lock");

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("thread 2 end lock");
                lock.unlock();
            }
        }).start();

        new Thread(() -> {
            System.out.println("thread 3 begin");
            try {
                if (lock.tryLock(4L, TimeUnit.SECONDS)){
                    try {
                        System.out.println("lock section 3");
                        try {
                            Thread.sleep(6000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }finally {
                        lock.unlock();
                        System.out.println("end 3");
                    }
                }else {
                    System.out.println("lock is locked");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();





    }
}
