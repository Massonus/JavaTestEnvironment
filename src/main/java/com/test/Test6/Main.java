package com.test.Test6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        /*String s1 = "Dog";

        String s2 = "Dog";

        String s3 = "Cat";

        String s4 = new String("Dog");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s4);

        s1.toLowerCase();

        System.out.println(s1);*/

        Random random = new Random();

        int id = random.nextInt(1, 50);

        if (id < 10 || id > 45) {
            System.out.println("John");

        } else if (id < 20 || id > 30) {
            System.out.println("Nick");
        } else {
            System.out.println("Makso");
        }

        System.out.println(id);


    }
}
