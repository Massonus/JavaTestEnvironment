package org.test.pLesson26.p1.localClass;

public class OutClass {
    private int intVar = 1;
    private static int staticIntVar = 2;
    private final int finalIntVar = 3;

    void anyMethodOfOuter() {
        class LocalClass {
            void anyMethodLocal() {
                intVar = 10;
                staticIntVar = 20;
                int localVar = finalIntVar;
            }
        }

        LocalClass localOb = new LocalClass();
        localOb.anyMethodLocal();
    }

    @Override
    public String toString() {
        return "OutClass{" +
                "intVar=" + intVar +
                ", staticIntVar=" + staticIntVar +
                ", finalIntVar=" + finalIntVar +
                '}';
    }

    public static void main(String[] args) {
        OutClass outerObj = new OutClass();

        System.out.println(outerObj);

        outerObj.anyMethodOfOuter();

        System.out.println(outerObj);

    }

}
