package com.test.lesson2.p2;

public class PrimitiveDataType {
    public static void main(String[] args) {
        byte b = 10;
        short s = 25;
        int i = 1024;
        long l = 15000L;

        float f = 91.54F;
        double d = 32.48;

        double d1 = 2.0;
        double d2 = 1.1;
        double d3 = 1.5e14;
        double d4 = 1.5e-14;
        System.out.println(d1 - d2);    //0.8999999999999999

        System.out.println(Math.sin(2));
        System.out.println(Math.PI);

        char c = 97;
        System.out.println("var c = " + c); //a
        char c1 = 33;
        System.out.println("var c1 = " + c1);
        System.out.println(c + c1);

        boolean b1 = false;
        boolean b2 = true;
    }
}
