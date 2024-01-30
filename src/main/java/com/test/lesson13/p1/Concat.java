package com.test.lesson13.p1;

public class Concat {
    public static void main(String[] args) {
        String string1 = "Hello " + "World";
        System.out.println("string1 - " + string1);

        String string2 = "Java";

        String string3 = string1 + string2;
        System.out.println("string3 - " + string3);

        string3 = string1.concat(string2);
        System.out.println("string3 with concat - " + string3);

        System.out.println(2 + 3 + "Hello");
        System.out.println("Hello" + 2 + 3);
        System.out.println("Hello" + (2 + 3));


    }
}
