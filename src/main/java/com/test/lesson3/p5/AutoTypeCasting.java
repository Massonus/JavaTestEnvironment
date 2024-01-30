package com.test.lesson3.p5;

public class AutoTypeCasting {
    static byte b;
    static short sh;
    static int i;
    static long l;
    static float f;
    static double d;

    public static void main(String[] args) {
        b = -32;
        i = b;

        b = 1000 / 20; // b = 50
//        b = 10000 / 20; // b = 500
//        b = (byte) (10000 / 20); // b = 500

        i = 1;
//        b = 2 * i;
        b *= 2;

        sh = -640;
        i = sh;

        l = 200;
//        i = l;
//        i = (int) l;
//        i = l * 2;

        l = b;
        l = sh;

        char c = 'Z';
        i = c; // i = 90 = unicode 'Z'

        boolean b1 = false;
//        i = b1; //incompatible types

        f = 3.409033f;
        d = f; // d = 3.409033


        i = 28;
        d = i; // d = 28.0
        f = i; // f = 28.0

//        i = f;
//        i = (int) f;

    }


}
