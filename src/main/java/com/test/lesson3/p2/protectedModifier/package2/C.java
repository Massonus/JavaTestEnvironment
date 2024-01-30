package com.test.lesson3.p2.protectedModifier.package2;

import com.test.lesson3.p2.protectedModifier.package1.A;

public class C extends A {
    public static void main(String[] args) {
//        A a = new A();
//        a.methodA();
//        int c = a.varA;

        C c = new C();
        c.methodA();
        int a = c.varA;
    }
}
