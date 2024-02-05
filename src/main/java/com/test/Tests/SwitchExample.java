package com.test.Tests;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter first value");
        int first = scanner.nextInt();
        System.out.println("Enter second value");
        int second = scanner1.nextInt();

        System.out.println("Enter what you want to do (use only *, /, +, -, %)");
        String choose = scanner2.nextLine();
        int result = 0;

        switch (choose) {
            case "+":
               result = first + second;
                System.out.println(result);
                break;
            case "-":
                result = first - second;
                System.out.println(result);
                break;
            case "*":
                result = first * second;
                System.out.println(result);
                break;
            case "/":
                result = first / second;
                System.out.println(result);
                break;
            case "%":
                result = first % second;
                System.out.println(result);
                break;
            default:
                System.out.println("Incorrect symbol");
        }

    }
}
