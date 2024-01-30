package com.test.lesson3.p4;

public class StaticVariable {
    private static int speed;
    public static final int maxSpeed = 280;

    public static void main(String[] args) {
        System.out.println("default speed = " + StaticVariable.speed);
//        maxSpeed = 320;

        StaticVariable bmw = new StaticVariable();
        bmw.speed = 220;
        System.out.println("bmw speed = " + bmw.speed);

        StaticVariable audi = new StaticVariable();
        audi.speed = 280;
        System.out.println("audi speed = " + audi.speed);

        System.out.println("bmw speed = " + bmw.speed);

    }
}
