package org.test.lesson3.p5;

public class ExplicitTypeCasting {
    static byte b;
    static int i;
    static double d;
    static float f;

    public static void main(String[] args) {
        d = -51.925448476;

        i = (int) d;
        System.out.println("double - " + d + " to int = " + i);     // i = -51

        f = (float) d;
        System.out.println("double - " + d + " to float = " + f);   // f = -51.92545

        b = (byte) d;
        System.out.println("double - " + d + " to byte = " + b);    // b = -51

        d = 64330932;
        b = (byte) d;
        System.out.println("big double number - " + d + " to byte = " + b);   // b = -76 - overflow

        i = -15;
        b = (byte) i;
        System.out.println("int - " + i + " to byte = " + b);     // b = -15
    }


}
