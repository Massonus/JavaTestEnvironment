package com.test.lesson16.p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Suppressed {
    public static void withoutSuppressed(String filePath) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new IOException(e);
        } finally {
            fileInputStream.close();
        }
    }

    public static void withSuppressed(String filePath) throws IOException {
        Throwable firstException = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
        } catch (IOException e) {
            firstException = e;
        } finally {
            try {
                fileInputStream.close();
            } catch (NullPointerException secondException) {
                if (firstException != null) {
                    secondException.addSuppressed(firstException);
                }
                throw secondException;
            }
        }
    }

    public static void main(String[] args) throws IOException {
//        Suppressed.withoutSuppressed("file.txt");
//        Suppressed.withSuppressed("file.txt");
    }
}
