package com.test.lesson7.p3;

import java.util.Scanner;

public class ScannerWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select genre of film:");
        System.out.println("1. Comedy:");
        System.out.println("2. Thriller");
        System.out.println("3. Horror");
        System.out.println("4. Drama");

        int genre = scanner.nextInt();

        switch (genre)
        {
            case 1:
                System.out.println("Category Comedy");
                break;
            case 2:
                System.out.println("Category Thriller");
                break;
            case 3:
                System.out.println("Category Horror");
                break;
            case 4:
                System.out.println("Category Drama");
                break;
            default:
                System.out.println("No such category exist");
        }
    }
}
