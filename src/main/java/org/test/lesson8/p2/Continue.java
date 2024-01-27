package org.test.lesson8.p2;

public class Continue {
    public static void main(String[] args) {

      /*  for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) continue;
            System.out.println(i);
        }*/

        OUTER:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue OUTER;
                }
                System.out.print(" " + (i * j));
            }
        }
    }
}
