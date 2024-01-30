package com.test.pLesson22.p4;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {
//        ArrayList<String> names = new ArrayList<>();    //ConcurrentModificationException
        CopyOnWriteArrayList<String> names = new CopyOnWriteArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Kate");
        names.add("Frank");
        System.out.println(names);

        Runnable runnable1 = () -> {
            Iterator<String> iterator = names.iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print(iterator.next() + " ");
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            names.remove(3);
            names.add("Alisa");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("\n" + names);
    }
}
