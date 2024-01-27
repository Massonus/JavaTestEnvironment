package org.test.pLesson22.p5;

import java.util.List;

public class MyRun implements Runnable {

    private final List<Integer> integerList;

    public MyRun(List<Integer> integerList) {
        this.integerList = integerList;
    }

    @Override
    public void run() {
        for (int j = 0; j < integerList.size() / 2; j++) {
            System.out.println(integerList.get(j));
        }
    }
}
