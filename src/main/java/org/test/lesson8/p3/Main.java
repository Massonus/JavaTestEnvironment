package org.test.lesson8.p3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int  a = 0;

     /*   while (a <= 10) {
            a ++;
            if (a == 2) {
                break;
            }
            Mouse mouse = new Mouse();
            mouse.id = a;
            mouse.name = "Mouse" + a;
            System.out.println(mouse);
        }*/

       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Please input isMouse");
        boolean isMouse = scanner.nextBoolean();*/

        Scanner scanner1 = new Scanner(System.in);
        int i;

        do {
            System.out.println("1. Please input if you want to watch video");
            System.out.println("2. Please input if you want to play game");
            System.out.println("3. Please input if you want to stop");
            i = scanner1.nextInt();

        } while (i < 1 || i > 3);

        switch (i){
            case 1:
                System.out.println("Video");
                break;
            case 2:
                System.out.println("Game");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Incorrect symbol");
        }


    }

}
