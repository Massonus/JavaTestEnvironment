package org.test.lesson16;

public class Main {

    public static void main(String[] args) {
        final Utils utils = new Utils();

        /*try {
            final int result = utils.getResult(10, 0);
            System.out.println("result is " + result);
        } catch (ArithmeticException e) {
            final StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                System.out.println(stackTraceElement);
            }
        } finally {

        }

        System.out.println("This is work");*/


        /*try {
            utils.setUpAccess("Petro");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        System.out.println("Its done");*/

        final int length = utils.getId(0);
        System.out.println(length);

    }

}
