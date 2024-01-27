package org.test.lesson16.p1;

public class ExampleTryCatch {
    public static void main(String[] args) {
        try {
//            int a = 0;
//            int b = 42 / a;

            int array[] = {4, 8, 1};
            System.out.println(array[3]);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
//            System.out.println(e.getClass());
//            System.out.println(e.getMessage());

            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                System.out.println(stackTraceElement.toString());
            }

//            e.printStackTrace();
        }

        System.out.println("Program is still running");

    }
}
