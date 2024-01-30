package com.test.lesson21.p5;

public class Main {

    public static void main(String[] args) {
        final Serialization serialization = new Serialization();
       /* final Mouse mouse = new Mouse();
        mouse.setName("Jerry");

        serialization.serial(mouse);*/

        final Mouse des = serialization.des();
        System.out.println(des);
    }

}
