package com.test.pLesson22.p5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        Runnable runnable1 = () -> {
            for (int j = 0; j < integerList.size() / 2; j++) {
                System.out.println(integerList.get(j));
            }
        };

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = () -> {
            for (int j = integerList.size() / 2; j < integerList.size(); j++) {
                System.out.println(integerList.get(j));
            }
        };

        Thread thread2 = new Thread(runnable2);
        thread2.start();

        MyThread myThread = new MyThread(integerList);
        myThread.start();

        Thread thread = new Thread(new MyRun(integerList));
        thread.start();

    /*    test(integerList);
        test1(integerList);*/

    }

    static void test(List<Integer> integerList) {
        Runnable runnable = () -> {
            for (int j = 0; j < integerList.size() / 2; j++) {
                System.out.println(integerList.get(j));
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
      /*  try {
            thread.join(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/
    }

    static void test1(List<Integer> integerList) {
        Runnable runnable1 = () -> {
            for (int j = integerList.size() / 2; j < integerList.size(); j++) {
                System.out.println(integerList.get(j));
            }
        };
        Thread thread = new Thread(runnable1);
        thread.start();
    }

}
