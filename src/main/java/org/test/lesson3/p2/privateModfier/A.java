package org.test.lesson3.p2.privateModfier;

public class A {
    private int varA;

    private void methodA() {
    }

    public static void main(String[] args) {
        A a = new A();
        a.methodA();
        int b = a.varA;

        double ee = 0.1 * 3;
        double ee1 = 0.3;

        System.out.println(ee);
        System.out.println(ee == ee1);
    }
}
