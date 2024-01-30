package com.test.lesson3.p4;

public class StaticBlock {
    private static int count;

    static {
        count = 100;

        StaticBlock staticBlock = new StaticBlock();
        staticBlock.invokeCounter();
        System.out.println("---- Initialize static block");
    }

    public void invokeCounter() {
        count++;
        System.out.println("Current count = " + count);
    }

    public static void main(String[] args) {
        StaticBlock staticBlock2 = new StaticBlock();
        staticBlock2.invokeCounter();

        StaticBlock staticBlock3 = new StaticBlock();
        staticBlock3.invokeCounter();
    }
}
