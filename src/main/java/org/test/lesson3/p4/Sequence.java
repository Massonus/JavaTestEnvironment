package org.test.lesson3.p4;

public class Sequence {

    int GetInt(String s) {
        System.out.println("Non-static initialization - " + s);
        return 100;
    }

    static int GetIntStatic(String s) {
        System.out.println("Static initialization - " + s);
        return 5;
    }

    {
        System.out.println("Non-static block");
    }

    static {
        System.out.println("static block");
    }

    int i1 = GetInt("i1");
    static int static_i1 = GetIntStatic("static_i1");
    int i2 = GetInt("i2");
    int i3 = GetInt("i3");
    static int static_i2 = GetIntStatic("static_i2");
    int i4 = GetInt("i4");
    static int static_i3 = GetIntStatic("static_i3");

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
    }
}
