package org.test.lesson8.p1;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
        } while (++i < 10);


        Scanner scanner = new Scanner(System.in);
        int genre = 0;

        do {
            System.out.println("Select genre of film:");
            System.out.println("1. Comedy:");
            System.out.println("2. Thriller");
            System.out.println("3. Horror");
            genre = scanner.nextInt();

        } while (genre < 1 || genre > 3);

        switch (genre) {
            case 1:
                System.out.println("Category Comedy");
                break;
            case 2:
                System.out.println("Category Thriller");
                break;
            case 3:
                System.out.println("Category Horror");
                break;
        }


    }


}
