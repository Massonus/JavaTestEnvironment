package com.test.lesson8.p2;

public class BreakWithLabel {
    public static void main(String[] args) {

        OUTER:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
                if (i == 3 && j == 3) {
                    break OUTER;
                }
            }
        }


    }


}
