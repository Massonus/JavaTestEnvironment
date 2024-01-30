package com.test.pLesson22.p3;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReenTrantReadWriteLockApp {
    public static void main(String[] args) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        new Thread(() -> {
            reentrantReadWriteLock.readLock().lock();
            try {
                System.out.println("reading start a");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("reading end a");
                reentrantReadWriteLock.readLock().unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                reentrantReadWriteLock.readLock().lock();
                System.out.println("reading start b");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("reading end b");
                reentrantReadWriteLock.readLock().unlock();
            }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            reentrantReadWriteLock.readLock().lock();

            try {
                System.out.println("reading start c");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("reading end c");
                reentrantReadWriteLock.readLock().unlock();
            }
        }).start();

        new Thread(() -> {
            reentrantReadWriteLock.writeLock().lock();

            try {
                System.out.println("writing start a");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("writing end a");
                reentrantReadWriteLock.writeLock().unlock();
            }
        }).start();

        new Thread(() -> {
            reentrantReadWriteLock.writeLock().lock();

            try {
                System.out.println("writing start b");
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("writing end b");
                reentrantReadWriteLock.writeLock().unlock();
            }
        }).start();
    }
}
