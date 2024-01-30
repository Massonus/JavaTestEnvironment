package com.test.lesson3.p4;

public class StaticClass {
    private int a1 = 5;
    private static int b1 = 10;

    void getStaticIntFromInClass() {
//        System.out.println(b2);
        System.out.println(InClass.b2);
    }

    static class InClass {
        private int a2 = 15;
        private static int b2 = 20;

        void getIntFromOutClass() {
//            System.out.println(a1);
            System.out.println(b1);
        }
    }

    class InClassNonStatic {
        private int a3 = 15;
//        private static int b2 = 20;  //can declarations static var in inner classes from djk 16

        void getStaticIntFromOutClass() {
            System.out.println(a1);
            System.out.println(b1);
        }

        void getStaticIntFromInClass() {
//            System.out.println(b2);
            System.out.println(InClass.b2);
        }
    }
}
