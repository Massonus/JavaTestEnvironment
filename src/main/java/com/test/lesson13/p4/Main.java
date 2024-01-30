package com.test.lesson13.p4;

import com.test.lesson1.Animal;

public class Main {

    public static void main(String[] args) {

        String dog = "dog";

        String dog1 = "dog";

        String dog2 = new String("dog");

        System.out.println(dog.equals(dog2));

        String ex1 = "Hello world!";

        String ex2 = "Hi cat!";

        double d = 20.0D;

        Animal animal = new Animal();

        String ex3 = d + animal.toString();

        String s = 50 + 20 + "41" + "result";

        System.out.println(ex3);

        System.out.println(50 + (20 + "41") + "result");

        System.out.println(s);

        final String h = s.concat("h");

        System.out.println(h);


    }

}
