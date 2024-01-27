package org.test.lesson21.p1;

import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) {
 /*       String text = "Hello world JAVA";
        char[] textArr = text.toCharArray();


        try (Reader reader = new CharArrayReader(textArr)) {
            int a;
            while ((a = reader.read()) != -1){
                char str = (char) a;
                System.out.print(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/



        System.out.println();
        byte[] numbersArr = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (InputStream inputStream = new ByteArrayInputStream(numbersArr)) {
            inputStream.skip(2);

            System.out.println("\nmarkSupported? - " + inputStream.markSupported());
            inputStream.mark(3);

            System.out.println("first read - " + inputStream.read());
            System.out.println("second read - " + inputStream.read());

            inputStream.skip(2);
            System.out.println("third read - " + inputStream.read());

            inputStream.reset();

            int a;
            while ((a = inputStream.read()) != -1) {
                System.out.print(a);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
