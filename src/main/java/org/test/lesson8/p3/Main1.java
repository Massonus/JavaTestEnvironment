package org.test.lesson8.p3;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int i1 = scanner.nextInt();

        Mouse mouse;

        for (int i = 0; i < 20; i++) {
            if (i == i1) {
                break;
            }
            mouse = new Mouse();
            mouse.id = i;
            mouse.name = "m" + i;
            System.out.println(mouse);
        }

    }

}
