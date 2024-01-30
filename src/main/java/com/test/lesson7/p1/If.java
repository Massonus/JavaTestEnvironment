package com.test.lesson7.p1;

public class If {

    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //bad code
        if (x > y) System.out.println("x greater then y");
        if (x < y) System.out.println("y greater then x");
        if (x == y) System.out.println("x equals y");

        if (x > y) {
            int result = x * y;
            System.out.println(result);
        }


    }


}
