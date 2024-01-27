package org.test.Test4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input range");

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int i1 = scanner.nextInt();

        Random random = new Random();
        int result = random.nextInt(i, i1);
        System.out.println(result);


    }
}
