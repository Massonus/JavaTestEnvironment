package org.test.lesson7.p3;

import java.util.Scanner;

public class ReadConsoleData {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");

        int number = scanner.nextInt();

//        if (scanner.hasNext()){
//            System.out.println("method hasNext");
//        }
//        if (scanner.hasNextInt()){
//            System.out.println("method hasNextInt");
//        }
//        if (scanner.hasNextDouble()){
//            System.out.println("method hasNextDouble");
//        }

        System.out.println("You entered " + number);

        scanner.close();
    }

}
