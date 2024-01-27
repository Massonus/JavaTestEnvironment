package org.test.pLesson22.p4;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
//        HashMap<Integer, String> map = new HashMap<>();     //ConcurrentModificationException
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();     //ConcurrentModificationException
        map.put(1 ,"John");
        map.put(2, "Ann");
        map.put(3, "Kate");
        map.put(4, "Frank");
        System.out.println(map);

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Integer i = iterator.next();
                System.out.print(i + ":" + map.get(i) + " ");
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            map.put(5,"Alisa");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("\n" + map);
    }
}
