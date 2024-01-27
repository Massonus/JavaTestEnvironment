package org.test.lesson21.p2;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        File java = new File("src/org.test.lesson21/p2", "java.png");
        File javaCopy = new File("src/org.test.lesson21/p4", "javaCopy.png");

        try (FileInputStream inputStream = new FileInputStream(java);
             FileOutputStream outputStream = new FileOutputStream(javaCopy)) {
            inputStream.transferTo(outputStream);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
