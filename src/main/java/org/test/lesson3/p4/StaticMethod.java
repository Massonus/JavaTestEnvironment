package org.test.lesson3.p4;

public class StaticMethod {
    static int count;

    public static void invokeCounter() {
        count++;
        System.out.println("Current Counter = " + count);
    }

    public static void main(String[] args) {
        StaticMethod.invokeCounter();
        StaticMethod.invokeCounter();
        StaticMethod.invokeCounter();
    }

}
